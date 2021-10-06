import java.util.Scanner;

public class TestScanner
{

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        System.out.print("Podaj liczbe rzeczywista: ");
        double x = in.nextDouble();

        System.out.print("Podaj liczbe całkowita: ");
        int n = in.nextInt();

        System.out.println(x + "^" + n + " = " + Math.pow(x, n));

        System.out.printf("%.3f^%d = %.3f%n", x, n, Math.pow(x, n));
    }

}

