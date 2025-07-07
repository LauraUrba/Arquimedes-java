/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testUnitarios;

import modelo.Administrador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author laura
 */
public class AdministradorTest {
    
    private Administrador instance;

    /**
     *
     */
    @Before
    public void setUp() {
        instance = new Administrador(
            "20211001",         // matrícula
            "Laura",            // nome
            "laura@email.com",  // email
            "Rua A, 123",       // endereço
            "99999-9999",       // telefone
            "laura_login",      // login
            "ADM001",           // idAdministrador
            "total"             // permissões
        );
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testGetIdAdministrador() {
        String expected = "ADM001";
        String result = instance.getIdAdministrador();
        assertEquals(expected, result);
    }

    @Test
    public void testSetIdAdministrador() {
        instance.setIdAdministrador("ADM002");
        assertEquals("ADM002", instance.getIdAdministrador());
    }

    @Test
    public void testGetPermissoes() {
        assertEquals("total", instance.getPermissoes());
    }

    @Test
    public void testSetPermissoes() {
        instance.setPermissoes("limitado");
        assertEquals("limitado", instance.getPermissoes());
    }

    @Test
    public void testGerenciarLivros() {
        instance.gerenciarLivros(); // sem retorno, só testando se não dá erro
    }

    @Test
    public void testGerenciarUsuario() {
        instance.gerenciarUsuario(); // sem retorno, só testando se não dá erro
    }

    @Test
    public void testAprovarTrocas() {
        instance.aprovarTrocas(); // sem retorno, só testando se não dá erro
    }
    
}
