/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.LogFile;

import static config.config.USER_FILE;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author CLIENTE
 */
public class UserFile {

    public String recuperaUsuario() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(USER_FILE);
        BufferedReader br = new BufferedReader(fr);
        
        String lastUser = br.readLine();
        
       
        fr.close();
        br.close();
        System.out.println(lastUser);
        return lastUser;
        
    }
    
    public void salvarUsuario(String conta) throws IOException {
        FileWriter fw = new FileWriter(USER_FILE, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(conta);
            bw.close();
            fw.close();
    }
       
}
