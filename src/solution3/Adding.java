package solution3;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Adding {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileOutputStream out = null;
        int sum = 0;
        try {
            fileReader = new FileReader("D:\\PDP\\Bootcamp\\Java\\JavaBackend (O'tkirbek aka)\\Exam\\src\\solution3\\first.txt");
            out = new FileOutputStream("D:\\PDP\\Bootcamp\\Java\\JavaBackend (O'tkirbek aka)\\Exam\\src\\solution3\\second.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split(" ");

                for (String num : numbers) {
                    for (int j = 0; j < num.length(); j++) {
                        if (!Character.isDigit(num.charAt(j))) {
                            System.out.println("Invalid number found. Please check file");
                            return;
                        }
                    }
                    sum += Integer.parseInt(num);
                }
            }
            String writer = String.valueOf(sum);
            out.write(writer.getBytes());
            System.out.println("Answer has been written to file");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fileReader != null && out != null) {
                    fileReader.close();
                    out.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
