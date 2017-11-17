/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Service;

/**
 *
 * @author comp8
 */
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projetomdi.Classes.CadastroLivro;

//As exceções devem ser propagadas para a camada de apresentação, ou seja, deve ser utilizado throws em cada um dos métodos
public class LivrosDao {

    public void delete(CadastroLivro cadastroLivro) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from livros where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cadastroLivro.getCodigo());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void insert(CadastroLivro cadastroLivro) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();

            String sql = "insert into livros ("
                    + "nome,"
                    + "autor,"
                    + "ano,"
                    + "num_paginas,"
                    + "genero,"
                    + "editora,"
                    + "quantidade"
                    + ") "
                    + "values(?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cadastroLivro.getNome());
            ps.setString(2, cadastroLivro.getAutor());
            ps.setInt(3, cadastroLivro.getAno());
            ps.setInt(4, cadastroLivro.getNum_paginas());
            ps.setString(5, cadastroLivro.getGenero());
            ps.setString(6, cadastroLivro.getEditora());
            ps.setInt(7, cadastroLivro.getQuantidade());
            ps.execute();

            conn.commit();

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void update(CadastroLivro cadastroLivro) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update livros set "
                    + "nome,"
                    + "autor,"
                    + "ano,"
                    + "num_paginas,"
                    + "genero,"
                    + "editora,"
                    + "quantidade"
                    + "where codigo = ?";
            ps = conn.prepareStatement(sql);

            ps.setString(1, cadastroLivro.getNome());
            ps.setString(2, cadastroLivro.getAutor());
            ps.setInt(3, cadastroLivro.getAno());
            ps.setInt(4, cadastroLivro.getNum_paginas());
            ps.setString(5, cadastroLivro.getGenero());
            ps.setString(6, cadastroLivro.getEditora());
            ps.setInt(7, cadastroLivro.getQuantidade());

            ps.execute();
            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public List<CadastroLivro> getAll() {
        List<CadastroLivro> lista = new ArrayList<CadastroLivro>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select "
                    + "codigo,"
                    + "nome,"
                    + "autor,"
                    + "ano,"
                    + "num_paginas,"
                    + "genero,"
                    + "editora,"
                    + "quantidade"
                    + " from livros";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer codigo = rs.getInt(1);
                String nome = rs.getString(2);
                String autor = rs.getString(3);
                Integer ano = rs.getInt(4);
                Integer num_paginas = rs.getInt(5);
                String genero = rs.getString(6);
                String editora = rs.getString(7);
                Integer quantidade = rs.getInt(8);

                CadastroLivro cadastroLivro = new CadastroLivro();

                cadastroLivro.setCodigo(codigo);
                cadastroLivro.setNome(nome);
                cadastroLivro.setAutor(autor);
                cadastroLivro.setAno(ano);
                cadastroLivro.setNum_paginas(num_paginas);
                cadastroLivro.setGenero(genero);
                cadastroLivro.setEditora(editora);
                cadastroLivro.setQuantidade(quantidade);

                lista.add(cadastroLivro);
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return lista;
    }

    public CadastroLivro getCadastroLivro(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select "
                    + "codigo,"
                    + "nome,"
                    + "autor,"
                    + "ano,"
                    + "num_paginas,"
                    + "genero,"
                    + "editora,"
                    + "quantidade"
                    + " from livros"
                    + "where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                String nome = rs.getString(2);
                String autor = rs.getString(3);
                int ano = rs.getInt(4);
                int num_paginas = rs.getInt(5);
                String genero = rs.getString(6);
                String editora = rs.getString(7);
                int quantidade = rs.getInt(8);

                CadastroLivro cadastroLivro = new CadastroLivro();

                cadastroLivro.setCodigo(codigo);
                cadastroLivro.setNome(nome);
                cadastroLivro.setAutor(autor);
                cadastroLivro.setAno(ano);
                cadastroLivro.setNum_paginas(num_paginas);
                cadastroLivro.setGenero(genero);
                cadastroLivro.setEditora(editora);
                cadastroLivro.setQuantidade(quantidade);

                return cadastroLivro;
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return null;
    }
}
