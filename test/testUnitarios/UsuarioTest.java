/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testUnitarios;

import modelo.Usuario;
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
public class UsuarioTest {

    private Usuario instance;
    
    public UsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
  public void setUp() {
    instance = new Usuario("20250001", "Maria", "maria@email.com", "Rua das Flores", "123456789", "meu_login");
}
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMatricula method, of class Usuario.
     */
    @Test
    public void testGetMatricula() {
        System.out.println("getMatricula");
        instance.setMatricula("20250001");
        String expResult = "20250001";
        String result = instance.getMatricula();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetMatricula() {
        System.out.println("setMatricula");
        String matricula = "20250002";
        instance.setMatricula(matricula);
        assertEquals(matricula, instance.getMatricula());
    }

    @Test
    public void testGetNome() {
        System.out.println("getNome");
        instance.setNome("Maria");
        assertEquals("Maria", instance.getNome());
    }

    @Test
    public void testSetNome() {
        System.out.println("setNome");
        instance.setNome("Maria");
        assertEquals("Maria", instance.getNome());
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        instance.setEmail("laura@email.com");
        assertEquals("laura@email.com", instance.getEmail());
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        instance.setEmail("laura@email.com");
        assertEquals("laura@email.com", instance.getEmail());
    }

    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        instance.setEndereco("Rua das Flores");
        assertEquals("Rua das Flores", instance.getEndereco());
    }

    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        instance.setEndereco("Rua das Palmeiras");
        assertEquals("Rua das Palmeiras", instance.getEndereco());
    }

    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        instance.setTelefone("123456789");
        assertEquals("123456789", instance.getTelefone());
    }

    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        instance.setTelefone("987654321");
        assertEquals("987654321", instance.getTelefone());
    }

    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        instance.setLogin("meu_login");
        assertEquals("meu_login", instance.getLogin());
    }

    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        instance.setLogin("outro_login");
        assertEquals("outro_login", instance.getLogin());
    }

    @Test
    public void testAlteracao() {
        System.out.println("alteracao");
        instance.alteracao("Ana", "ana_login");
        assertEquals("Ana", instance.getNome());
        assertEquals("ana_login", instance.getLogin());
    }

    @Test
    public void testRealizarCadastro() {
        System.out.println("realizarCadastro");
        instance.setNome("Lucas");
        instance.setLogin("lucas_login");
        instance.realizarCadastro();
        // Aqui você pode adicionar asserts se o método alterar algum valor verificável
    }

    @Test
    public void testListagem() {
        System.out.println("listagem");
        instance.setNome("Carlos");
        instance.setLogin("carlos_login");
        instance.listagem();
        // Idealmente, você verificaria a saída do método se possível
    }

    @Test
    public void testExecutar() {
        System.out.println("executar");
        instance.executar();
        // Verifique efeitos colaterais ou alterações no estado, se houver
    }
    
}
