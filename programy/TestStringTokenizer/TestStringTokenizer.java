import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Stack;

public class TestStringTokenizer
{

    public static void main(String[] args)
    {

        System.out.println("\nWprowadź kolejny łańcuch znaków i naciśnij <Enter>.");
        System.out.println("Aby zakończyć program naciśnij: <Ctrl> + d\n");

        Scanner in = new Scanner(System.in);


        while (in.hasNextLine()) {
            String str = in.nextLine();
            StringTokenizer strTok = new StringTokenizer(str);
            Stack<String> stack = new Stack<String>();

            while (strTok.hasMoreTokens()) {
                stack.push(strTok.nextToken());
            }

            StringBuffer revStr = new StringBuffer();

            while (!stack.empty()) {
                revStr.append(stack.pop());
                revStr.append(" ");
            }

            System.out.println("Original string: " + str);
            System.out.println("\nReversed string: " + revStr + "\n");
        }

    }

}

