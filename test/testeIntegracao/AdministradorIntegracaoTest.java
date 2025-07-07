/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package testeIntegracao;

import modelo.Administrador;
import modelo.Conexao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.*;



/**
 *
 * @author laura
 */
public class AdministradorIntegracaoTest {


    private Connection conexao;

       @Before
     public void setUp() throws Exception {
        conexao = Conexao.conectar();
        String sql = "DELETE FROM Usuario";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.executeUpdate();
    }
}

   @After
        public void tearDown() throws Exception {
         String sql = "DELETE FROM Usuario";
         try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
             stmt.executeUpdate();
         }
         if (conexao != null && !conexao.isClosed()) {
             conexao.close();
          }
        }

    @Test
    public void testSalvarEBuscarAdministrador() throws Exception {
        Administrador adm = new Administrador(
            "20211001", "Laura", "laura@email.com", "Rua A, 123",
            "99999-9999", "laura_login", "ADM001", "total"
        );

        adm.salvar((Administrador) conexao);

        Administrador recuperado = Administrador.buscarPorId(conexao, "ADM001");

        assertNotNull(recuperado);
        assertEquals("Laura", recuperado.getNome());
        assertEquals("laura_login", recuperado.getLogin());
        assertEquals("total", recuperado.getPermissoes());
    }

    }
