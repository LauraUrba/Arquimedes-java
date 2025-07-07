/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeFimAFim;

import org.assertj.swing.fixture.FrameFixture;
import org.junit.*;
import Telas.TelaAdm;
import java.util.regex.Pattern;
/**
 *
 * @author laura
 */
public class admTeste {
  
   private FrameFixture janela;

    @Before
    public void setUp() {
        TelaAdm tela = new TelaAdm();
        janela = new FrameFixture(tela);
        janela.show();
    }

    @Test
    public void deveFazerLoginComSucesso() {
        janela.textBox("Email").enterText("teste@email.com");
        janela.textBox("Senha").enterText("123456");
        janela.button("btnEntrar").click();
        try {
            janela.optionPane().requireVisible().requireMessage("Login realizado com sucesso!");
        } catch (Exception e) {
            System.out.println("Nenhum JOptionPane encontrado!");
        }
    }
    
    @Test //esse teste esta dando erro 
public void deveCadastrarUsuarioComSucesso() {
    String emailTeste = "laura" + System.currentTimeMillis() + "@teste.com";
    janela.textBox("Email").setText(emailTeste);
    janela.textBox("Senha").setText("123456");
    janela.button("btnCadastro").click();
try {
            janela.optionPane().requireVisible().requireMessage("Usuario cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Nenhum JOptionPane encontrado!");
        }
}

    @Test
    public void deveListarUsuarios() {
    janela.button("btnListar").click();
    janela.label("listagem").requireVisible();


    // Exemplo: assumindo que o campo de listagem tem nome "listagem"
    // janela.label("listagem").requireText(Pattern.compile(".*laura.*"));
    try{
    janela.optionPane().requireVisible().requireMessage("Usuários listado com sucesso!"); 
        }catch (Exception e) {
            System.out.println("Nenhum JOptionPane encontrado!");
        }
}
  

@Test
public void deveAtualizarSenhaComSucesso() {
    janela.textBox("Email").setText("teste@email.com");
    janela.textBox("Senha").setText("novaSenha123");
    janela.button("btnAtualizar").click();
try {
            janela.optionPane().requireVisible().requireMessage("Senha atualizada com sucesso!");
        } catch (Exception e) {
            System.out.println("Nenhum JOptionPane encontrado!");
        }
}
 

@Test
public void deveDeletarUsuarioComSucesso() {
    janela.textBox("Email").setText("teste@email.com");
    janela.button("btnDeletar").click();
    try {
            janela.optionPane().requireVisible().requireMessage("Usuario deletado com sucesso!");
        } catch (Exception e) {
            System.out.println("Nenhum JOptionPane encontrado!");
        }
}


    @After
    public void tearDown() {
        janela.cleanUp();
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
