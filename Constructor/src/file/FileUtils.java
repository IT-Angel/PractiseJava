package file;

import java.io.*;
import java.util.Scanner;

public class FileUtils {

    public void readFile() {
        File file = new File("output.txt");
        Scanner scanner = null;
try {
    scanner = new Scanner(file);
} catch (FileNotFoundException fileNotFoundException) {
    System.out.println("file isn't found");
}

if(scanner != null) {
    while (scanner.hasNextLine()) {
        String output = scanner.nextLine();
        System.out.println(output);
    }
}

        scanner.close();
    }


    public void printInFile() {

        File file = new File("output.txt");
        PrintStream out = null;

        try {
            //Create a file if it doesn't exist
            if(!file.exists()) {
                file.createNewFile();
            }
           out = new PrintStream(new FileOutputStream(file));
        } catch (IOException exception) {
            System.out.println("Mistake with files " + exception.getMessage());
        }


if(out != null) {

    Scanner scanner = new Scanner(System.in);

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

    scanner.close();
    out.close();
}


    }
}
