package config;

import java.io.File;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comp8
 */
public interface config {
    public static final String SYSTEM_ACCOUNT = "root";
    public static final String SYSTEM_PASSWORD = "123";
    public static final String LOG_FILENAME = "logfile.txt";
    public static final File LOG_FILE = new File("logfile.txt");
    public static final File USER_FILE = new File("user.txt");
    
}
