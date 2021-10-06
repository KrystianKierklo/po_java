import java.util.Arrays;
import java.util.Random;

public class TestTablic
{
    public static void main (String[] args) {

        // long[] a;
        // a = new long[16]
        long[] a = new long[16];

        // wypisujemy elementy tablicy
        System.out.print("a: ");
        wypisz(a);
        
        // wypełniamy tablicę liczbami pseudolosowymi
        generuj (a, 50);
        
        // wypisujemy elementy tablicy
        System.out.print("a: ");
        wypisz(a);
        
        a = new long[12];
        // wypełniamy tablicę liczbami pseudolosowymi
        generuj (a, 50);

        // wypisujemy elementy tablicy
        System.out.print("a: ");
        wypisz(a);
        
        // wypisujemy elementy tablicy za pomocą metody statycznej z klasy Arrays
        System.out.print("a: ");
        System.out.println(Arrays.toString(a));

        long b[] = new long[2 * a.length];

        // kopiujemy tablicę a do tablicy b
        System.arraycopy (a, 0, b, 0, a.length);

        // wypisujemy elementy tablicy b
        System.out.print("b: ");
        wypisz(b);

        // sortujemy i wypisujemy elementy tablicy b
        Arrays.sort(b);
        System.out.print("b: ");
        wypisz(b);

    }

    // generuje pseudolosowe liczby całkowite z przedziału [0..max)
    public static void generuj (long[] tab, int max) {
        Random r = new Random();
        for (int j = 0; j < tab.length; ++j) {
            tab[j] = r.nextInt(max);
        }
    }

    public static void wypisz(long[] tab) {
        for (long el : tab) {
            System.out.print(el + " ");
        }
        System.out.println("");
    }

}

