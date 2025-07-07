/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeIntegracao;

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
public class ConexaoIntegração {


public class ConexaoIntegracaoTest {

    @Test
    public void testConexaoMySQL() {
        Connection conexao = Conexao.conectar();
        assertNotNull("Conexão com o banco deve ser estabelecida", conexao);

        try {
            assertFalse("Conexão não deve estar fechada", conexao.isClosed());
            conexao.close(); // sempre importante fechar após o teste
        } catch (Exception e) {
            fail("Erro ao testar a conexão: " + e.getMessage());
        }
    }
}
}
