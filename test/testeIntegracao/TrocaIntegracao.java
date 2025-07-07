/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeIntegracao;

import modelo.Troca;
import modelo.Livro;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
/**
 *
 * @author laura
 */
public class TrocaIntegracao {
  
    @Test
    public void testCriarEExecutarTrocaComLivroAssociado() {
        // Cria o livro associado
        Livro livro = new Livro("LIV123", "O Hobbit", "Disponível", "J.R.R. Tolkien");
        LocalDate LocalDate = null;

        // Cria a troca associando o livro
        Troca troca = new Troca("TROCA001", livro.getCodigo(), "20211001", LocalDate);

        // Executa os métodos da troca
        troca.inicializarTroca();
        troca.realizarTroca();
        troca.finalizarTroca();

        // Verifica integridade dos dados
        assertEquals("LIV123", troca.getCodigoLivro());
        assertEquals("TROCA001", troca.getCodigoTroca());
        assertEquals("20211001", troca.getMatriculaUsuario());
        assertNotNull(troca.getData());
    }
}

