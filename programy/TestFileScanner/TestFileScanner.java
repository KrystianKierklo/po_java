import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TestFileScanner
{

    public static void main(String[] args) throws FileNotFoundException
    {

        if (args.length != 1) {
            System.err.println("Sposób użycia: java TestFileScanner nazwaPliku");
            System.exit(1);
        }

        Scanner file = new Scanner(new File("TestFileScanner.java"));

        int ile = 0;

        while (file.hasNextLine()) {
            String line = file.nextLine();
            ++ile;
            System.out.println(line);
        }

        System.out.println("\nIlość linii w pliku: " + ile + "\n");
    }

}

