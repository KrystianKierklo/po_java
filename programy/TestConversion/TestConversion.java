public class TestConversion
{
    public static void main(String[] args)
    {
        int n = 123456789;
        float f = n;
        System.out.println(f);
        char c = 'A';
        c = (char)((int) c + 1);
        System.out.println(c);
    }
}

