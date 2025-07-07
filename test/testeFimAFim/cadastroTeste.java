/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeFimAFim;

import org.assertj.swing.fixture.FrameFixture;
import org.junit.*;
import Telas.TelaCadastro;
/**
 *
 * @author laura
 */
public class cadastroTeste {
     private FrameFixture janela;

    @Before
    public void setUp() {
        TelaCadastro tela = new TelaCadastro();
        janela = new FrameFixture(tela);
        janela.show();
    }

    @Test
    public void deveFazerCadastroComSucesso() {
        janela.textBox("Nome").enterText("Laura Teste");
        janela.textBox("Email").enterText("teste@email.com");
        janela.textBox("Endereco").enterText("Rua das Laranjeiras, 123");
        janela.textBox("Telefone").enterText("(49) 91234-5678");
        janela.textBox("Senha").enterText("123456");
        
        janela.button("btnCadastro").click();
        try {
            janela.optionPane().requireVisible().requireMessage("Usuario Cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Nenhum JOptionPane encontrado!");
        }
    }
    
    @After
    public void tearDown() {
        janela.cleanUp();
    }
}
