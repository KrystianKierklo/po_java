public class ArgumentsDemo
{
    public static void main(String[] args)
    {
        if (args.length == 0) {
            System.out.println("Brak argumentów wywołania programu");
            System.exit(0);
        }

        if (args[0].equals("-h")) {
            System.out.print("Hello,");
        } else if (args[0].equals("-g")) {
            System.out.print("Goodbye,");
        }

        // wyświetlamy pozostałe argumenty wywołania programu
        for (int j = 1; j < args.length; ++j) {
            System.out.print(" " + args[j]);
        }
        System.out.println("!");
    }
}

