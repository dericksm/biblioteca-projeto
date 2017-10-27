package projetomdi.LogFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static config.config.LOG_FILE;
import static config.config.LOG_FILENAME;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogFiles implements Serializable {

    public static boolean setFileContentAsStackTrace(File file, Throwable t, String user) {

        StringWriter sw = null;
        PrintWriter pw = null;
        try {
            sw = new StringWriter();
            pw = new PrintWriter(sw);
            t.printStackTrace(pw);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy aa hh:mm:ss");
            String text = "\r\n Usuário: " + user + "\r\n\r\n" + sdf.format(new Date()) + "\r\n" + sw.toString();
            return setFileContentAsText(file, text);
        } finally {
            try {
                if (pw != null) {
                    pw.close();
                }
            } finally {
                if (sw != null) {
                    try {
                        sw.close();
                    } catch (IOException ex) {
                        //não tratato propositalmente por tal motivo
                    }
                }
            }
        }
    }

    public static boolean setFileContentAsStackTrace(File file, String message) {

        StringWriter sw = null;
        PrintWriter pw = null;
        try {
            sw = new StringWriter();
            pw = new PrintWriter(sw);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy aa hh:mm:ss");
            String text = "\r\n\r\n" + sdf.format(new Date()) + "\r\n" + message;
            return setFileContentAsText(file, text);
        } finally {
            try {
                if (pw != null) {
                    pw.close();
                }
            } finally {
                if (sw != null) {
                    try {
                        sw.close();
                    } catch (IOException ex) {
                        //não tratato propositalmente por tal motivo
                    }
                }
            }
        }

    }

    public static boolean setFileContentAsText(File file, String text) {
        try {
            if (!file.exists()) {
                PrintWriter writer = new PrintWriter(LOG_FILENAME, "UTF-8");
                writer.close();
            }
            if (file == null || !file.isFile()) {
                throw new FileNotFoundException(file.getAbsolutePath());

            }
            if (text == null) {
                text = "";
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            bw.close();
            fw.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
