/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author laura
 */
public class Troca {
    private String codigoTroca;
    private String codigoLivro;
    private String matriculaUsuario;
    private LocalDate data;
    private Livro Livro; //associação 

    public Troca(String codigoTroca, String codigoLivro, String matriculaUsuario, LocalDate data) {
        this.codigoTroca = codigoTroca;
        this.codigoLivro = codigoLivro;
        this.matriculaUsuario = matriculaUsuario;
        this.data = data;
    }

    public String getCodigoTroca() {
        return codigoTroca;
    }

    public void setCodigoTroca(String codigoTroca) {
        this.codigoTroca = codigoTroca;
    }

    public String getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(String codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public String getMatriculaUsuario() {
        return matriculaUsuario;
    }

    public void setMatriculaUsuario(String matriculaUsuario) {
        this.matriculaUsuario = matriculaUsuario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void realizarTroca() {
        System.out.println("Troca realizada com sucesso no dia " + data + ".");
    }
    
    // Novo método: inicializarTroca
    public void inicializarTroca() {
        System.out.println("Troca com código " + codigoTroca + " foi inicializada.");
    }

    // Novo método: finalizarTroca
    public void finalizarTroca() {
        System.out.println("Troca com código " + codigoTroca + " foi finalizada.");
    }

}
