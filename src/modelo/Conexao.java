/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.*;
/**
 *
 * @author laura
 */
public class Conexao {
    public static Connection conectar() {
        Connection conexao = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3307/Arquimedes", // ou outro endereço
                "root",
                "Laura0601@");
            
        } catch (ClassNotFoundException erro) {
            System.out.println("Driver não encontrado.");
        } catch (SQLException erro) {
            System.out.println("Falha na conexão: " + erro.getMessage());
        }
        return conexao;
    }

    public static Connection getconnection() {
        return conectar();
    }

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
