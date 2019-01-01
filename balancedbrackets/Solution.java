import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {


        final char LEFT_NORMAL  = '(';
        final char RIGHT_NORMAL = ')';
        final char LEFT_CURLY   = '{';
        final char RIGHT_CURLY  = '}';
        final char LEFT_SQUARE  = '[';
        final char RIGHT_SQUARE = ']';

        Stack<Character> store = new Stack<Character>(); //From java.util.Stack
        int i; //An index into the string
        boolean failed = false;  //Change to true for a mismatch

        for (i =0; !failed && (i <s.length()); i++)
        {
            switch(s.charAt(i))
            {
                case LEFT_NORMAL:
                case LEFT_CURLY:
                case LEFT_SQUARE:
                    store.push(s.charAt(i));
                    break;
                case RIGHT_NORMAL:
                    if (store.isEmpty() || (store.pop() != LEFT_NORMAL))
                        failed = true;
                    break;
                case RIGHT_CURLY:
                    if (store.isEmpty() || (store.pop() != LEFT_CURLY))
                        failed = true;
                    break;
                case RIGHT_SQUARE:
                    if (store.isEmpty() || (store.pop() != LEFT_SQUARE))
                        failed = true;
                    break;

            }
        }

        if(store.isEmpty() && !failed){
            return "YES";
        } else {
            return "NO";
        }



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
