package batmonGen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private FileWriter writer;

    public Logger(String automatonName, boolean appendLogger) {
        String dirPath = System.getProperty("user.dir") + File.separator + "Gen" + File.separator;
        createWriter(automatonName, appendLogger, dirPath);
    }
    
    public Logger(String automatonName, boolean appendLogger, String dirPath) {
    	createWriter(automatonName, appendLogger, dirPath);
    }
    
    private void createWriter(String automatonName, boolean appendLogger, String dirPath) {
        try {
            File dir = new File(dirPath);
            dir.mkdirs();
            File actualFile = new File(dir, automatonName + "_log.txt");
            writer = new FileWriter(actualFile, appendLogger);

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void log(String text) {
        System.out.println(text);
        try {
            writer.write(text+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void appendToLine(String text) {
        System.out.print(text);
        try {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
