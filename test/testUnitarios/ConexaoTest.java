/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testUnitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static modelo.Conexao.conectar;
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
public class ConexaoTest {
    
    public ConexaoTest() {
    }
    
   private static Connection conn = null;
   
    public static Connection conectar() {
    if (conn == null) {
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3307/Arquimedes", "root", "Laura0601@");
    
        } catch (SQLException e) {
                System.err.println("Erro ao conectar com o banco de dados: " + e.getMessage());
            // Para depurar:
                return null;
        }
    }
    return conn;
}

    public static Connection getConnection() {
        return conectar();
    }
    
    @Test
    public void testConexao() {
    Connection conn = ConexaoTest.conectar();
    assertNotNull("A conexão não pode ser nula", conn);
}

}
