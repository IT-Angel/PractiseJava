package file;

import java.io.*;
import java.util.Scanner;

public class FileUtils {

    public void readFile() {
        File file = new File("output.txt");

try (Scanner scanner = new Scanner(file)) {

        while (scanner.hasNextLine()) {
            String output = scanner.nextLine();
            System.out.println(output);
    }
} catch (FileNotFoundException fileNotFoundException) {
    System.out.println("file isn't found");
}


    }


    public void printInFile() {

        File file = new File("output.txt");

        try (PrintStream out = new PrintStream(new FileOutputStream(file)); Scanner scanner = new Scanner(System.in)){
            //Create a file if it doesn't exist
            if(!file.exists()) {
                file.createNewFile();
            }


                System.out.println("Enter text for file");

                while (scanner.hasNextLine()) {
                    String input = scanner.nextLine();
                    if (!"exit".equalsIgnoreCase(input)) {
                        out.println(input);
                    }

                    if ("exit".equalsIgnoreCase(input)) {
                        break;
                    }
                }


        } catch (IOException exception) {
            System.out.println("Mistake with files " + exception.getMessage());
        }





    }
}
