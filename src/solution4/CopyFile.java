package solution4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            String outPath = "D:\\PDP\\Bootcamp\\Java\\JavaBackend (O'tkirbek aka)\\Exam\\src\\solution4\\copyDestination";
            String inPath = "D:\\PDP\\Bootcamp\\Java\\JavaBackend (O'tkirbek aka)\\Exam\\src\\solution4\\Konsta - Bilmaydi.mp3";

            outPath = outPath + inPath.substring(inPath.lastIndexOf("\\"));

            in = new FileInputStream(inPath);
            out = new FileOutputStream(outPath);

            int a;
            System.out.println("File copying started\nDo not stop the program!");

            while (true) {
                try {

                    if ((a = in.read()) != -1) {
                        out.write((char) a);
                    } else {
                        System.out.println("File has been copied");
                        break;
                    }
                } catch (IOException e) {
                    System.out.println("Error occurred");
                    System.out.println(e.getMessage());
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (in != null && out != null) {
                    in.close();
                    out.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
