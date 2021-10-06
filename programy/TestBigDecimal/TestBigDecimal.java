import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestBigDecimal {

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        System.out.print("Podaj dowolną liczbę rzeczywistą: ");
        String s1 = in.next();
        BigDecimal a = new BigDecimal(s1);
        System.out.println("scale = " + a.scale());

        System.out.print("Podaj dowolną liczbę rzeczywistą: ");
        String s2 = in.next();
        BigDecimal b = (new BigDecimal(s2)).setScale(2, RoundingMode.HALF_UP);
        System.out.println("scale = " + b.scale());

        BigDecimal c = a.add(b);
        BigDecimal d = a.subtract(b);
        BigDecimal e = a.multiply(b).setScale(3, RoundingMode.HALF_UP);
        BigDecimal f = a.divide(b, 3, RoundingMode.HALF_UP);

        System.out.println(a.toString() + " + " + b.toString() + " = " + c.toString());
        System.out.println(a.toString() + " - " + b.toString() + " = " + d.toString());
        System.out.println(a.toString() + " * " + b.toString() + " = " + e.toString());
        System.out.println(a.toString() + " / " + b.toString() + " = " + f.toString());

        BigDecimal pi = new BigDecimal(Math.PI);
        System.out.println("PI = " + pi.toString());
        System.out.println("PI * PI = " + pi.multiply(pi).toString());
        BigDecimal g = BigDecimal.ONE.divide(pi, pi.scale(), RoundingMode.HALF_UP);
        System.out.println("1 / PI = " + g.toString());
    }

}

