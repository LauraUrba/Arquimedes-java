/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testUnitarios;

import java.time.LocalDate;
import modelo.Troca;
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
public class TrocaTest {
    
    public TrocaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCodigoTroca method, of class Troca.
     */
    @Test
    public void testGetCodigoTroca() {
    System.out.println("getCodigoTroca");
    Troca instance = new Troca("T001", "L001", "U001", LocalDate.of(2023, 1, 1));
    String expResult = "T001";
    String result = instance.getCodigoTroca();
    assertEquals(expResult, result);
}

    /**
     * Test of setCodigoTroca method, of class Troca.
     */
   @Test
    public void testSetCodigoTroca() {
    System.out.println("setCodigoTroca");
    Troca instance = new Troca("T001", "L001", "U001", LocalDate.of(2023, 1, 1));
    instance.setCodigoTroca("T002");
    assertEquals("T002", instance.getCodigoTroca());
}


    /**
     * Test of getCodigoLivro method, of class Troca.
     */
    @Test
public void testGetCodigoLivro() {
    System.out.println("getCodigoLivro");
    Troca instance = new Troca("T001", "L123", "U456", LocalDate.now());
    String expResult = "L123";
    String result = instance.getCodigoLivro();
    assertEquals(expResult, result);
}

@Test
public void testSetCodigoLivro() {
    System.out.println("setCodigoLivro");
    Troca instance = new Troca("T001", "L123", "U456", LocalDate.now());
    instance.setCodigoLivro("L999");
    assertEquals("L999", instance.getCodigoLivro());
}

@Test
public void testGetMatriculaUsuario() {
    System.out.println("getMatriculaUsuario");
    Troca instance = new Troca("T001", "L123", "U456", LocalDate.now());
    String expResult = "U456";
    String result = instance.getMatriculaUsuario();
    assertEquals(expResult, result);
}

@Test
public void testSetMatriculaUsuario() {
    System.out.println("setMatriculaUsuario");
    Troca instance = new Troca("T001", "L123", "U456", LocalDate.now());
    instance.setMatriculaUsuario("U789");
    assertEquals("U789", instance.getMatriculaUsuario());
}



    /**
     * Test of getData method, of class Troca.
     */
    @Test
public void testGetData() {
    System.out.println("getData");
    Troca instance = new Troca("T001", "L001", "U001", LocalDate.of(2023, 1, 1));
    LocalDate novaData = LocalDate.of(2024, 12, 25);
    instance.setData(novaData);
    assertEquals(novaData, instance.getData());
}

    /**
     * Test of setData method, of class Troca.
     */
    @Test
   public void testSetData() {
    System.out.println("setData");
    Troca instance = new Troca("T001", "L001", "U001", LocalDate.of(2023, 1, 1));
    LocalDate novaData = LocalDate.of(2024, 12, 25);
    instance.setData(novaData);
    assertEquals(novaData, instance.getData());
}


    /**
     * Test of realizarTroca method, of class Troca.
     */
    @Test
    public void testRealizarTroca() {
    System.out.println("realizarTroca");
    Troca instance = new Troca("T003", "L002", "U002", LocalDate.of(2023, 5, 10));
    instance.realizarTroca(); // Você pode usar assert em saídas no console com libs como SystemLambda, mas aqui apenas executa.
}


    /**
     * Test of inicializarTroca method, of class Troca.
     */
    @Test
public void testInicializarTroca() {
    System.out.println("inicializarTroca");
    Troca instance = new Troca("T001", "L123", "U456", LocalDate.now());
    instance.inicializarTroca(); // Não lança exceção
    // Você pode usar assertNotNull, ou só verificar que não lança erro
}

@Test
public void testFinalizarTroca() {
    System.out.println("finalizarTroca");
    Troca instance = new Troca("T001", "L123", "U456", LocalDate.now());
    instance.finalizarTroca(); // Não lança exceção
}
    
}
