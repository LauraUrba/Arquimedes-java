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

import Telas.TelaInicial;
import Telas.TelaCatalogo;
import Telas.TelaLogin;
import Telas.TelaCadastro;


/**
 *
 * @author laura
 */
public class inicialTeste {
private Robot robot;
    private FrameFixture janela;
    private FrameFixture novaJanela;

    @Before
    public void setUp() {
        robot = BasicRobot.robotWithNewAwtHierarchy();
        TelaInicial telaInicial = new TelaInicial();
        janela = new FrameFixture(robot, telaInicial);
        janela.show();
    }

    @Test
    public void deveAbrirTelaCatalogoAoClicarEmLivro() {
        janela.button("btnLivro").click(); // clica no botão que abre a TelaCatalogo

    Frame encontrada = null;

    // Espera até 5 segundos pra garantir tempo suficiente pra abrir
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

    if (encontrada == null) {
        for (Frame frame : Frame.getFrames()) {
            System.out.println("↪ Janela detectada: " + frame.getClass().getName() + " (visível? " + frame.isShowing() + ")");
        }
        System.out.println("------ Janelas abertas no momento ------");
for (Frame frame : Frame.getFrames()) {
    System.out.println("Classe: " + frame.getClass().getName() +
                       " | Visível? " + frame.isShowing() +
                       " | Título: " + frame.getTitle() +
                       " | Name: " + frame.getName());
}
System.out.println("----------------------------------------");

        throw new AssertionError("TelaCatalogo não apareceu");
    }

    novaJanela = new FrameFixture(robot, encontrada);
    novaJanela.requireVisible();
}




    @Test
    public void deveAbrirTelaLoginAoClicarEmLogin() {
        janela.button("btnLogin").click();
        novaJanela = findFrame(TelaLogin.class).using(robot);
        novaJanela.requireVisible();
    }

    @Test
    public void deveAbrirTelaCadastroAoClicarEmCadastro() {
        janela.button("btnCadastro").click();
        novaJanela = findFrame(TelaCadastro.class).using(robot);
        novaJanela.requireVisible();
    }

    @After
    public void tearDown() {
        if (janela != null) janela.cleanUp();
        if (novaJanela != null) novaJanela.cleanUp();
        if (robot != null) robot.cleanUp();
    }
}


