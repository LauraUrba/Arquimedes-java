/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author laura
 */
public class Usuario {
    private String matricula;
    private String nome;
    private String email;
    private String endereco;
    private String telefone;
    String login;
    //colocar data do cadastro em mysql 
    //colocar login e  data (obrigatório) no usuario
    
    /*eventos: cadastro, listagem/relatório (ex: listas os 5 usuários - login), exclusão(somente 1 - login), 
alteração (pode alterar o que quiser, somente 1!)*/

    //fazer composição, obrigatório
    //na outra classe que vai usar a composição colocar os mesmos eventos cadastro, listagem, exclusão, alteração
    
    //Tela: login, principal, Tela para crud(listagem do usuario(fazer), cadastro), 

    public Usuario(String matricula, String nome, String email, String endereco, String telefone, String login) {
        this.matricula = "";
        this.nome = "";
        this.email = "";
        this.endereco = "";
        this.telefone = "";
        this.login = "";
    }

    public Usuario() {
       throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    //metodo realizar cadastro
    public void realizarCadastro() {
        System.out.println("Usuário " + nome + " cadastrado com sucesso!");
    }
    
    // Método de listagem
    public void listagem() {
        // Exemplo de ação: listar todos os livros ou usuários (dependendo do contexto)
        System.out.println("Listagem de informações do usuário:");
        System.out.println("Nome: " + nome);
        System.out.println("Login: " + login);
    }
    
    // Método executar
    public void executar() {
        // Exemplo de ação: execução de uma tarefa relacionada ao usuário
        System.out.println("Executando tarefas relacionadas ao usuário: " + nome);
    }
    
    // Método alteração
    public void alteracao(String novoNome, String novoLogin) {
        // Exemplo de ação: alterar informações do usuário
        this.nome = novoNome;
        this.login = novoLogin;
        System.out.println("Informações do usuário alteradas com sucesso!");
        System.out.println("Novo nome: " + nome);
        System.out.println("Novo login: " + login);
    }

}

 


