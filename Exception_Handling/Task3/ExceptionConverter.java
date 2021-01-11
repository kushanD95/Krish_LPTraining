import java.io.*;

import javax.management.RuntimeErrorException;

public class ExceptionConverter {

    public static void main(String[] args) {
        try {
            loadFile();
        } catch (RuntimeException e) {
            System.out.println("File not found exception wrap to runtime exception");
            e.printStackTrace();
        }
    }

    private static void loadFile() {
        try {
            FileInputStream file = new FileInputStream("./filee.txt");
            System.out.println("file load successfully");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
