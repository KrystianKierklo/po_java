class TestNumericTypes
{

    public static void main(String[] args)
    {

        // Przyklad przepelnienia
        double d = 1e308;
        System.out.print("overflow produces infinity: ");
        System.out.println(d + "*10==" + d * 10);

        // Przyklad stopniowego niedomiaru
        d = 1e-305 * Math.PI;
        System.out.print("gradual underflow: " + d + "\n    ");
        for (int i = 0; i < 4; i++) {
            System.out.print(" " + (d /= 100000));
        }
        System.out.println();

        // Przyklad NaN
        System.out.print("0.0/0.0 is Not-a-Number: ");
        d = 0.0 / 0.0;
        System.out.println(d);

        // Przyklad niedokladnych wynikow i zaokrąglenia
        System.out.print("inexact results with float:");
        for (int i = 0; i < 100; i++) {
            float z = 1.0f / i;
            if (z * i != 1.0f) {
                System.out.print(" " + i);
            }
        }
        System.out.println();

        // Inny przyklad niedokladnych wynikow i zaokraglenia
        System.out.print("inexact results with double:");
        for (int i = 0; i < 100; i++) {
            double z = 1.0 / i;
            if (z * i != 1.0) {
                System.out.print(" " + i);
            }
        }
        System.out.println();

        // Przyklad rzutowania do typu int
        System.out.print("cast to int rounds toward 0: ");
        d = 12345.6;
        System.out.println((int) d + " " + (int)(-d));
    }
}

