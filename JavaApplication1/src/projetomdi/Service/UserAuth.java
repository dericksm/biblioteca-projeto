/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Service;

import static config.config.LOG_FILE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import projetomdi.LogFile.LogFiles;

/**
 *
 * @author Simples-Dental
 */
public class UserAuth {
    static String currentUser;

    public UserAuth(String currentUser) {
        this.currentUser = currentUser;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }
    
    public static boolean autenticaUsuario(String usuario,String senha) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "SELECT usuario, senha FROM users where usuario = ? and senha = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
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
        return false;
    }
}
