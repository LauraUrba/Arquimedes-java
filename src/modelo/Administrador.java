/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;

/**
 *
 * @author laura
 */
public class Administrador extends Usuario {

    public static Administrador buscarPorId(Connection conexao, String adM001) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String idAdministrador;
    private String permissoes;
     
    
    public Administrador(String matricula, String nome, String email, String endereco, String telefone, String login, 
                         String idAdministrador, String permissoes) {
        super(matricula, nome, email, endereco, telefone, login);
        this.idAdministrador = idAdministrador;
        this.permissoes = permissoes;
    }

    public Administrador(Connection conexao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    
    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(String permissoes) {
        this.permissoes = permissoes;
    }

    public void gerenciarLivros() {
        System.out.println("Administrador " + getNome() + " está gerenciando os livros.");
    }
    // Novo método: gerenciarUsuário
    public void gerenciarUsuario() {
        System.out.println("Administrador " + getNome() + " está gerenciando os usuários.");
    }

    // Novo método: aprovarTrocas
    public void aprovarTrocas() {
        System.out.println("Administrador " + getNome() + " está aprovando trocas.");
    }

    public void salvar(Administrador adm) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Administrador buscarPorId(String adM001) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public void deletarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

    
