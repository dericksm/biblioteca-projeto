/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projetomdi.Classes.CadastroEmprestimo;

/**
 *
 * @author comp8
 */
public class EmprestimosDao {
    
    
    private int getMaxCodigo() {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "SELECT MAX(codigo) FROM emprestimos";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int codigo = rs.getInt(1);
                System.out.println(codigo);
                return codigo;
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
        return 0;
    }
    
    public void delete(CadastroEmprestimo emprestimo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from emprestimos where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, emprestimo.getCodigo());
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

    public void insert(CadastroEmprestimo emprestimo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into emprestimos (" +
                    "codigo," +
                    "codigo_cliente," +
                    "codigo_livro," +
                    "data_emprestimo," +
                    "data_devolucao," +
                    "prazo," +
                    "observacao"
                    + ") "
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            System.out.println(this.getMaxCodigo());
            ps.setInt(1, this.getMaxCodigo());
            ps.setInt(2, emprestimo.getCodigo_cliente());
            ps.setInt(3, emprestimo.getCodigo_livro());
            ps.setString(4, emprestimo.getData_emprestimo());
            ps.setString(5, emprestimo.getData_devolucao());
            ps.setInt(6, emprestimo.getPrazo());
            ps.setString(7, emprestimo.getObservacao());
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

    public void update(CadastroEmprestimo emprestimo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update emprestimos set " +
                    "codigo = ?," +
                    "codigo_cliente = ?," +
                    "codigo_livro = ?," +
                    "data_emprestimo = ?," +
                    "data_devolucao = ?," +
                    "prazo = ?," +
                    "observacao = ?"
                    + "where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, emprestimo.getCodigo());
            ps.setInt(2, emprestimo.getCodigo_cliente());
            ps.setInt(3, emprestimo.getCodigo_livro());
            ps.setString(4, emprestimo.getData_emprestimo());
            ps.setString(5, emprestimo.getData_devolucao());
            ps.setInt(6, emprestimo.getPrazo());
            ps.setString(7, emprestimo.getObservacao());
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

    public List<CadastroEmprestimo> getAll() {
        List<CadastroEmprestimo> lista = new ArrayList<CadastroEmprestimo>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select " +
                    "codigo," +
                    "codigo_cliente," +
                    "codigo_livro," +
                    "data_emprestimo," +
                    "data_devolucao," +
                    "prazo," +
                    "observacao"
                    + " from emprestimos";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer codigo = rs.getInt(1);
                Integer codigo_cliente = rs.getInt(2);
                Integer codigo_livro = rs.getInt(3);
                String data_emprestimo = rs.getString(4);
                String data_devolucao = rs.getString(5);
                Integer prazo = rs.getInt(6);
                String observacao = rs.getString(7);
                
                CadastroEmprestimo emprestimo = new CadastroEmprestimo();
                
                emprestimo.setCodigo(codigo);
                emprestimo.setCodigo_cliente(codigo_cliente);
                emprestimo.setCodigo_livro(codigo_livro);
                emprestimo.setData_emprestimo(data_emprestimo);
                emprestimo.setData_devolucao(data_devolucao);
                emprestimo.setPrazo(prazo);
                emprestimo.setObservacao(observacao);

                lista.add(emprestimo);
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

    public CadastroEmprestimo getCadastroCliente(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select " +
                    "codigo," +
                    "codigo_cliente," +
                    "codigo_livro," +
                    "data_emprestimo," +
                    "data_devolucao," +
                    "prazo," +
                    "observacao"
                    + "where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Integer codigo_cliente = rs.getInt(2);
                Integer codigo_livro = rs.getInt(3);
                String data_emprestimo = rs.getString(4);
                String data_devolucao = rs.getString(5);
                Integer prazo = rs.getInt(6);
                String observacao = rs.getString(7);
                
                CadastroEmprestimo emprestimo = new CadastroEmprestimo();
                
                emprestimo.setCodigo(codigo);
                emprestimo.setCodigo_cliente(codigo_cliente);
                emprestimo.setCodigo_livro(codigo_livro);
                emprestimo.setData_emprestimo(data_emprestimo);
                emprestimo.setData_devolucao(data_devolucao);
                emprestimo.setPrazo(prazo);
                emprestimo.setObservacao(observacao);

                return emprestimo;
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

