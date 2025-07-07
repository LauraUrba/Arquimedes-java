/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeIntegracao;

import modelo.Livro;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author laura
 */
public class LivroIntegracao {


    @Test
    public void testReservaDeLivroDisponivel() {
        Livro livro = new Livro("LIV123", "Guerra de Tronos livro1", "Disponível", "George R. R. Martin");

        assertTrue(livro.verificarDisponibilidade());

        livro.reservar();

        assertFalse(livro.verificarDisponibilidade());
    }

    @Test
    public void testReservaDeLivroIndisponivel() {
        Livro livro = new Livro("LIV456", "Harry Potter e o Priseioneiro de Azkaban", "Indisponível", "J.K.Rowling");

        assertFalse(livro.verificarDisponibilidade());

        livro.reservar(); // não deve alterar o estado

        assertFalse(livro.verificarDisponibilidade());
    }
}