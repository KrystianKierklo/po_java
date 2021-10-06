import java.util.Arrays;

public class ArraysDemo
{
    public static void main(String[] args)
    {
        String[] names = new String[10];
        for (int j = 0; j < names.length / 2; ++j) {
            names[j] = "";
        }
        names[0] = "Edward";
        names[1] = names[0];
        System.out.println("names = " + Arrays.toString(names));

        int[] primes = { 17, 19, 23, 29, 31 };
        primes = new int[] { 2, 3, 5, 7, 11, 13 };

        // Pętla foreach
        int sum = 0;
        for (int n : primes) {
            sum += n;
        }

        System.out.println("sum = " + sum);

        // Dwie referencje do tablicy
        int[] numbers = primes;
        numbers[5] = 42; // Zmienia tablicę prime
        System.out.println("primes = " + Arrays.toString(primes));

        // Kopia tablicy
        primes[5] = 13;
        int[] copiedPrimes = Arrays.copyOf(primes, primes.length);
        copiedPrimes[5] = 31; // Nie zmienia tablicy primes
        System.out.println("primes = " + Arrays.toString(primes));
        System.out.println("copiedPrimes = " + Arrays.toString(copiedPrimes));
    }
}

