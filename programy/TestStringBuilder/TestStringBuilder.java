// $ time java TestStringBuffer

public class TestStringBuilder
{
    public static void main(String[] args)
    {
        StringBuilder msg = new StringBuilder("Witaj");

        msg.append(" ").append("świecie!");

        System.out.println(msg);

        System.out.println(msg.length());

        for (int k = 0; k < 10000000; ++k) {

            for (int j = 0; j < msg.length(); ++j) {
                msg.setCharAt(j, Character.toUpperCase(msg.charAt(j)));
            }

        }

        System.out.println(msg);
        System.out.println(msg.toString().toLowerCase());

    }
}

