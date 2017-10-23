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

public class LogFiles implements Serializable{

    public static boolean setFileContentAsStackTrace(File file, Throwable t ) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy aa hh:mm:ss");
        String text = "\r\n\r\n" + sdf.format(new Date()) + "\r\n" + sw.toString();
        pw.close();
        try {
            sw.close();
        } catch (Exception e) {
        }
        return setFileContentAsText(file, text);
    }

    public static boolean setFileContentAsText(File file, String text ) {
        try {
            if(!file.exists()) {
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
