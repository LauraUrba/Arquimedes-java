/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testUnitarios;

import modelo.Livro;
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
public class LivroTest {
    
 private Livro instance; // Instância de Livro para os testes
 

    public LivroTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        // Criando uma instância de Livro antes de cada teste
        instance = new Livro("123ABC", "O Hobbit", "Disponível", "J.R.R. Tolkien");
    }

    @After
    public void tearDown() {
        instance = null; // Limpa a instância após cada teste
    }

    @Test
    public void testVerificarDisponibilidade() {
        System.out.println("verificarDisponibilidade");
        boolean expResult = true; // Livro está disponível
        boolean result = instance.verificarDisponibilidade();
        assertEquals(expResult, result);
    }

    @Test
    public void testReservar() {
        System.out.println("reservar");
        instance.reservar();
        assertFalse("O livro deveria estar reservado", instance.verificarDisponibilidade());
    }

    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        String expResult = "123ABC";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        instance.setCodigo("456DEF");
        assertEquals("456DEF", instance.getCodigo());
    }

    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        String expResult = "O Hobbit";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        instance.setTitulo("Senhor dos Anéis");
        assertEquals("Senhor dos Anéis", instance.getTitulo());
    }

    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        String expResult = "Disponível";
        String result = instance.getEstado();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        instance.setEstado("Reservado");
        assertEquals("Reservado", instance.getEstado());
    }

}
