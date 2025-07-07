/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeIntegracao;

import modelo.Usuario;
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
public class UsuarioIntegracao {
    

    @Test
    public void testCicloDeVidaUsuario() {
        // Cadastro
        Usuario usuario = new Usuario("20211001", "Laura", "laura@email.com", "Rua A, 123", "99999-9999", "laura_login");
        usuario.realizarCadastro();

        // Validações iniciais
        assertEquals("Laura", usuario.getNome());
        assertEquals("laura_login", usuario.getLogin());

        // Listagem
        usuario.listagem();

        // Alteração
        usuario.alteracao("Laura Martins", "lmartins");

        // Validação pós-alteração
        assertEquals("Laura Martins", usuario.getNome());
        assertEquals("lmartins", usuario.getLogin());

        // Execução de tarefa
        usuario.executar();
    }
}