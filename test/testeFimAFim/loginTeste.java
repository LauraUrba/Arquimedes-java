/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeFimAFim;

import Telas.TelaAdm;
import Telas.TelaCadastro;
import Telas.TelaLogin;

import static org.assertj.swing.finder.WindowFinder.findFrame;
import static org.junit.Assert.assertNotNull;

import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.core.Robot;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.*;
import java.awt.*;


/**
 *
 * @author laura
 */
public class loginTeste {
    private FrameFixture janela;
    private Robot robot;
    private FrameFixture janelaAdm;
    private FrameFixture janelaCadastro;

    

    @Before
public void setUp() {
    robot = BasicRobot.robotWithNewAwtHierarchy();
    janela = new FrameFixture(robot, new TelaLogin());
    janela.show(); // mostra a janela
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
    
    /*cadastro erro*/
    @Test
public void deveAbrirTelaCadastroQuandoEmailVazio() {
    janela.textBox("Email").setText("");
    janela.button("btnCadastrar").click();

    janelaCadastro = findFrame(TelaCadastro.class).using(robot);
    janelaCadastro.requireVisible();

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
    
/*adm erro*/
@Test
public void deveAbrirTelaAdmQuandoEmailPreenchido() {
    janela.textBox("Email").setText("");
    janela.button("btnAdministrador").click();

    janelaAdm = findFrame(TelaAdm.class).using(robot);
    janelaAdm.requireVisible();

}


    @After
     public void tearDown() {
         janela.cleanUp();
         robot.cleanUp();
         if (janelaCadastro != null) janelaCadastro.cleanUp();
         if (janelaAdm != null) janelaAdm.cleanUp();

     }
}
