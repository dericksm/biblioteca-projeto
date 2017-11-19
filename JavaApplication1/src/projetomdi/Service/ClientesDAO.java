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
import static config.config.LOG_FILE;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projetomdi.Classes.CadastroCliente;
import projetomdi.LogFile.LogFiles;

//As exceções devem ser propagadas para a camada de apresentação, ou seja, deve ser utilizado throws em cada um dos métodos
public class ClientesDAO {

    String currentUser;

    public ClientesDAO(String currentUser) {
        this.currentUser = currentUser;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    private int getMaxCodigo() {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "SELECT MAX(codigo) FROM clientes";
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int codigo = rs.getInt(1);
                System.out.println(codigo);
                return codigo;
            }
        } catch (SQLException e) {
            LogFiles.setFileContentAsStackTrace(LOG_FILE, e, currentUser);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    LogFiles.setFileContentAsStackTrace(LOG_FILE, ex, currentUser);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    LogFiles.setFileContentAsStackTrace(LOG_FILE, ex, currentUser);
                }
            }
        }
        return 0;
    }

    public void delete(CadastroCliente cadastroCliente) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from clientes where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cadastroCliente.getCodigo());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            LogFiles.setFileContentAsStackTrace(LOG_FILE, e, currentUser);

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    LogFiles.setFileContentAsStackTrace(LOG_FILE, ex, currentUser);
                }
            }
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    LogFiles.setFileContentAsStackTrace(LOG_FILE, ex, currentUser);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    LogFiles.setFileContentAsStackTrace(LOG_FILE, ex, currentUser);
                }
            }
        }
    }

    public void insert(CadastroCliente cadastroCliente) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into clientes ("
                    + "nome,"
                    + "endereco,"
                    + "numero,"
                    + "bairro,"
                    + "referencia,"
                    + "cidade,"
                    + "cep,"
                    + "telefone,"
                    + "celular,"
                    + "email,"
                    + "rg,"
                    + "cpf,"
                    + "data_nasc,"
                    + "observacao,"
                    + "codigo"
                    + ")"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cadastroCliente.getNome());
            ps.setString(2, cadastroCliente.getEndereco());
            ps.setInt(3, cadastroCliente.getNumero());
            ps.setString(4, cadastroCliente.getBairro());
            ps.setString(5, cadastroCliente.getReferencia());
            ps.setString(6, cadastroCliente.getCidade());
            ps.setInt(7, cadastroCliente.getCep());
            ps.setInt(8, cadastroCliente.getTelefone());
            ps.setInt(9, cadastroCliente.getCelular());
            ps.setString(10, cadastroCliente.getEmail());
            ps.setInt(11, cadastroCliente.getRg());
            ps.setInt(12, cadastroCliente.getCpf());
            ps.setString(13, cadastroCliente.getData_nasc());
            ps.setString(14, cadastroCliente.getObservacao());
            System.out.println(this.getMaxCodigo());
            ps.setInt(15, this.getMaxCodigo());
            ps.execute();

            conn.commit();

        } catch (SQLException e) {
            LogFiles.setFileContentAsStackTrace(LOG_FILE, e, currentUser);

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    LogFiles.setFileContentAsStackTrace(LOG_FILE, ex, currentUser);
                }
            }
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    LogFiles.setFileContentAsStackTrace(LOG_FILE, ex, currentUser);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    LogFiles.setFileContentAsStackTrace(LOG_FILE, ex, currentUser);
                }
            }
        }
    }

    public void update(CadastroCliente cadastroCliente) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update clientes set "
                    + "nome = ?,"
                    + "endereco = ?,"
                    + "numero = ?,"
                    + "bairro = ?,"
                    + "referencia = ?,"
                    + "cidade = ?,"
                    + "cep,"
                    + "telefone,"
                    + "celular = ?,"
                    + "email = ?,"
                    + "rg = ?,"
                    + "cpf = ?,"
                    + "data_nasc = ?,"
                    + "observacao = ? "
                    + "where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cadastroCliente.getNome());
            ps.setString(2, cadastroCliente.getEndereco());
            ps.setInt(3, cadastroCliente.getNumero());
            ps.setString(4, cadastroCliente.getBairro());
            ps.setString(5, cadastroCliente.getReferencia());
            ps.setString(6, cadastroCliente.getCidade());
            ps.setInt(7, cadastroCliente.getCep());
            ps.setInt(8, cadastroCliente.getTelefone());
            ps.setInt(9, cadastroCliente.getCelular());
            ps.setString(10, cadastroCliente.getEmail());
            ps.setInt(11, cadastroCliente.getRg());
            ps.setInt(12, cadastroCliente.getCpf());
            ps.setString(13, cadastroCliente.getData_nasc());
            ps.setString(14, cadastroCliente.getObservacao());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            LogFiles.setFileContentAsStackTrace(LOG_FILE, e, currentUser);

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    LogFiles.setFileContentAsStackTrace(LOG_FILE, ex, currentUser);
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    LogFiles.setFileContentAsStackTrace(LOG_FILE, ex, currentUser);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    LogFiles.setFileContentAsStackTrace(LOG_FILE, ex, currentUser);
                }
            }
        }
    }

    public List<CadastroCliente> getAll() {
        List<CadastroCliente> lista = new ArrayList<CadastroCliente>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select "
                    + "codigo,"
                    + "nome,"
                    + "endereco,"
                    + "numero,"
                    + "bairro,"
                    + "referencia,"
                    + "cidade,"
                    + "cep,"
                    + "telefone,"
                    + "celular,"
                    + "email,"
                    + "rg,"
                    + "cpf,"
                    + "data_nasc,"
                    + "observacao"
                    + " from clientes";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer codigo = rs.getInt(1);
                String nome = rs.getString(2);
                String endereco = rs.getString(3);
                Integer numero = rs.getInt(4);
                String bairro = rs.getString(5);
                String referencia = rs.getString(6);
                String cidade = rs.getString(7);
                Integer cep = rs.getInt(8);
                Integer telefone = rs.getInt(9);
                Integer celular = rs.getInt(10);
                String email = rs.getString(11);
                Integer rg = rs.getInt(12);
                Integer cpf = rs.getInt(13);
                String data_nasc = rs.getString(14);
                String observacao = rs.getString(15);

                CadastroCliente cadastroCliente = new CadastroCliente();

                cadastroCliente.setCodigo(codigo);
                cadastroCliente.setNome(nome);
                cadastroCliente.setEndereco(endereco);
                cadastroCliente.setNumero(numero);
                cadastroCliente.setBairro(bairro);
                cadastroCliente.setReferencia(referencia);
                cadastroCliente.setCidade(cidade);
                cadastroCliente.setCep(cep);
                cadastroCliente.setTelefone(telefone);
                cadastroCliente.setCelular(celular);
                cadastroCliente.setEmail(email);
                cadastroCliente.setRg(rg);
                cadastroCliente.setCpf(cpf);
                cadastroCliente.setData_nasc(data_nasc);
                cadastroCliente.setObservacao(observacao);

                lista.add(cadastroCliente);
            }
        } catch (SQLException e) {
            LogFiles.setFileContentAsStackTrace(LOG_FILE, e, currentUser);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    LogFiles.setFileContentAsStackTrace(LOG_FILE, ex, currentUser);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    LogFiles.setFileContentAsStackTrace(LOG_FILE, ex, currentUser);
                }
            }
        }
        return lista;
    }

    public CadastroCliente getCadastroCliente(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select "
                    + "codigo,"
                    + "nome,"
                    + "endereco,"
                    + "numero,"
                    + "bairro,"
                    + "referencia,"
                    + "cidade,"
                    + "cep,"
                    + "telefone,"
                    + "celular,"
                    + "email,"
                    + "rg,"
                    + "cpf,"
                    + "data_nasc,"
                    + "observacao"
                    + " from clientes"
                    + "where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nome = rs.getString(2);
                String endereco = rs.getString(3);
                Integer numero = rs.getInt(4);
                String bairro = rs.getString(5);
                String referencia = rs.getString(6);
                String cidade = rs.getString(7);
                Integer cep = rs.getInt(8);
                Integer telefone = rs.getInt(9);
                Integer celular = rs.getInt(10);
                String email = rs.getString(11);
                Integer rg = rs.getInt(12);
                Integer cpf = rs.getInt(13);
                String data_nasc = rs.getString(14);
                String observacao = rs.getString(15);

                CadastroCliente cadastroCliente = new CadastroCliente();

                cadastroCliente.setCodigo(codigo);
                cadastroCliente.setNome(nome);
                cadastroCliente.setEndereco(endereco);
                cadastroCliente.setNumero(numero);
                cadastroCliente.setBairro(bairro);
                cadastroCliente.setReferencia(referencia);
                cadastroCliente.setCidade(cidade);
                cadastroCliente.setCep(cep);
                cadastroCliente.setTelefone(telefone);
                cadastroCliente.setCelular(celular);
                cadastroCliente.setEmail(email);
                cadastroCliente.setRg(rg);
                cadastroCliente.setCpf(cpf);
                cadastroCliente.setData_nasc(data_nasc);
                cadastroCliente.setObservacao(observacao);

                return cadastroCliente;
            }
        } catch (SQLException e) {
            LogFiles.setFileContentAsStackTrace(LOG_FILE, e, currentUser);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    LogFiles.setFileContentAsStackTrace(LOG_FILE, ex, currentUser);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    LogFiles.setFileContentAsStackTrace(LOG_FILE, ex, currentUser);
                }
            }
        }
        return null;
    }
}
