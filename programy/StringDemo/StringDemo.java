public class StringDemo
{
    public static void main(String[] args)
    {
        String msg = "Witaj świecie!";

        System.out.println(msg);

        System.out.println(msg.length());

        for (int j = 0; j < msg.length(); ++j) {
            System.out.print(msg.charAt(j));
        }
        System.out.println();

        String s = msg.substring(6, 12); // świeci
        System.out.println(s);

        System.out.println(s.equals(msg)); // false

        System.out.println(s.compareTo("świat")); // 4

        String t = "  Zasady   obowiązują   ";
        System.out.println(t.trim() + "."); // Zasady   obowiązują.
        System.out.println(t.trim() + "."); // Zasady   obowiązują.

        System.out.println("   abc   ".trim() + "."); // abc.

        System.out.println("\"Hello\"");

        System.out.println(System.out.toString());

        System.out.println("Pingwin".equals("pingwin")); // false

        System.out.println("Pingwin".equalsIgnoreCase("pingwin")); // true

        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2); // false

        System.out.println(s1.equals(s2)); // true
    }
}

