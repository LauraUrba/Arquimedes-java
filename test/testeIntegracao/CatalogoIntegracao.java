/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeIntegracao;

import modelo.Catalogo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.*;
/**
 *
 * @author laura
 */
public class CatalogoIntegracao {

    private final Connection conexao;

    public CatalogoIntegracao (Connection conexao) {
        this.conexao = conexao;
    }

    public void criarTabela() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS catalogo (" +
                     "isbn VARCHAR(20) PRIMARY KEY, " +
                     "nome VARCHAR(100), " +
                     "autor VARCHAR(100), " +
                     "codigoSite VARCHAR(50))";
        conexao.createStatement().execute(sql);
    }

    public void salvar(Catalogo catalogo) throws SQLException {
        String sql = "INSERT INTO catalogo (isbn, nome, autor, codigoSite) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, catalogo.getIsbn());
        stmt.setString(2, catalogo.getNome());
        stmt.setString(3, catalogo.getAutor());
        stmt.setString(4, catalogo.getCodigoSite());
        stmt.executeUpdate();
    }

    public Catalogo buscarPorIsbn(String isbn) throws SQLException {
        String sql = "SELECT * FROM catalogo WHERE isbn = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, isbn);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return new Catalogo(
                rs.getString("nome"),
                rs.getString("autor"),
                rs.getString("isbn"),
                rs.getString("codigoSite")
            );
        }
        return null;
    }
}
