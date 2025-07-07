/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeFimAFim;

import static org.junit.Assert.assertNotNull;

import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.core.Robot;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.*;

import java.awt.*;

import Telas.TelaLivro;

import Telas.TelaCatalogo;

/**
 *
 * @author laura
 */
public class livro12Teste {
    private FrameFixture janela;
    private FrameFixture novaJanela;
    private Robot robot;

    @Before
    public void setUp() {
        robot = BasicRobot.robotWithNewAwtHierarchy();
        TelaLivro telaLivro = new TelaLivro();
        janela = new FrameFixture(robot, telaLivro);

        janela.show();
    }

    @Test
    public void deveVoltarParaTelaCatalogo() {
        janela.button("btnVoltar").click();

        Frame encontrada = null;
        long timeout = System.currentTimeMillis() + 5000;

        while (System.currentTimeMillis() < timeout) {
            for (Frame frame : Frame.getFrames()) {
                if (frame instanceof TelaCatalogo && frame.isShowing()) {
                    encontrada = frame;
                    break;
                }
            }
            if (encontrada != null) break;
            try { Thread.sleep(200); } catch (InterruptedException ignored) {}
        }

        assertNotNull("TelaCatalogo não apareceu!", encontrada);
        novaJanela = new FrameFixture(robot, encontrada);
        novaJanela.requireVisible();
    }

    @After
    public void tearDown() {
        if (janela != null) janela.cleanUp();
        if (novaJanela != null) novaJanela.cleanUp();
        if (robot != null) robot.cleanUp();
    }

}
