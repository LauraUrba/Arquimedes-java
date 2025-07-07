/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeFimAFim;

import static org.assertj.swing.finder.WindowFinder.findFrame;
import static org.junit.Assert.assertNotNull;

import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.core.Robot;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.*;
import java.awt.*;

import Telas.TelaLivro;
import Telas.TelaCatalogo;
import Telas.TelaLivro;
import Telas.TelaLivro1;
import Telas.TelaLivro2;

/**
 *
 * @author laura
 */
public class catalogoTeste {

private FrameFixture janela;
    private Robot robot;
    private FrameFixture novaJanela;

    @Before
    public void setUp() {
        robot = BasicRobot.robotWithNewAwtHierarchy();
        TelaCatalogo tela = new TelaCatalogo();
        janela = new FrameFixture(robot, tela);
        janela.show();
    }

    @Test
    public void deveAbrirTelaLivro() {
        janela.button("btnVisualizar").click();
        novaJanela = findFrame("TelaLivro").using(robot);
        novaJanela.requireVisible();
    }

    @Test
    public void deveAbrirTelaLivro2() {
        janela.button("btnVisualizar1").click();
        novaJanela = findFrame("TelaLivro2").using(robot);
        novaJanela.requireVisible();
    }

    @Test
    public void deveAbrirTelaLivro1() {
        janela.button("btnVisualizar2").click();
        novaJanela = findFrame("TelaLivro1").using(robot);
        novaJanela.requireVisible();
    }

    @Test
    public void deveVoltarParaTelaInicial() {
        janela.button("btnVoltar").click();
        novaJanela = findFrame("TelaInicial").using(robot);
        novaJanela.requireVisible();
    }

    @After
    public void tearDown() {
        if (janela != null) janela.cleanUp();
        if (novaJanela != null) novaJanela.cleanUp();
        if (robot != null) robot.cleanUp();
    }
}
