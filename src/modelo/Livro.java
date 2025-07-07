/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author laura
 */
public class Livro {

    public static int getSelectedRow() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Object getValueAt(int linhaSelecionada, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String codigo;
    private String titulo;
    private String estado;
    private String autor;
    private String status;
    private double preco;
    private String categoriaGenero;
    private String sinopse;
    private boolean disponivel; //verficiar a disponibilidade
    private Usuario usuario; //associação

    //composição
    public Livro(Usuario usuario){
    this.usuario = usuario; 
    }
    
    // Construtor
    public Livro(String codigo, String titulo, String estado, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.estado = estado;
        this.autor = autor;
        this.preco = preco;
        this.categoriaGenero = categoriaGenero;
        this.sinopse = sinopse;
        this.disponivel = estado.equalsIgnoreCase("Disponível");
    }

    /*Livro(String abc, String o_Hobbit, String jrr_Tolkien, String disponível) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    
   public boolean verificarDisponibilidade() {
        return disponivel; // Retorna true se o livro está disponível
    }

    // Método reservar
    public void reservar() {
        if (disponivel) {
            disponivel = false; // Marca como reservado
            System.out.println("O livro \"" + titulo + "\" foi reservado.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está reservado.");
        }
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    

    public String getCategoriaGenero() {
        return categoriaGenero;
    }

    public void setCategoriaGenero(String categoriaGenero) {
        this.categoriaGenero = categoriaGenero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    

    public Usuario getUsuario() { //getusuario
        return usuario;
    }
    

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo + "\nAutor: " + autor + "\nGênero: " + categoriaGenero);
    }

    }

