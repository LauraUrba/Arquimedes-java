/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author laura
 */
public class Catalogo {
    private String nome;
    private String autor;
    private String isbn;
    private String codigoSite;

    // Construtor
    public Catalogo(String nome, String autor, String isbn, String codigoSite) {
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        this.codigoSite = codigoSite;
    }

    // Métodos Getters
    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getCodigoSite() {
        return codigoSite;
    }

    // Métodos Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setCodigoSite(String codigoSite) {
        this.codigoSite = codigoSite;
    }
}
