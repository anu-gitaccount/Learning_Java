import java.util.*;

public class string_method {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //scanner.nextLine();
        //scanner.nextInt();
        //scanner.nextFloat();
        //scanner.nextDouble();
        //scanner.next();   // Reads one word (until space)


        // Next Topic String Methods
        // String = Refrence data type

        // boolean result =  str.equal(string, var);
        String name = "Ren";

        boolean ans = name.equals("ren");   // return False
        ans = name.equalsIgnoreCase("ren"); //return True (case Insensitive)
        System.out.println(ans);

        // Length of string = str.length
        int size = name.length();

        // To access a certain char in string we use str.charAt(Index)
        // We cant use indexing in string (thus use of charAT() method)
        char third_char = name.charAt(2);
        System.out.println(third_char);

        // To find the index of certain char = str.indexOf(char)
        int ind = name.indexOf('n');
        System.out.println(ind);

        // To check if a string is empty = str.isEmpty()
        // returns a boolean value
        boolean res = name.isEmpty();

        String name_uppercase = name.toUpperCase();
        String name_lowercase = name.toLowerCase();
        String name_strip_whitespaces = name.trim();

        String replace_char = name.replace('n', 'm');





        scanner.close();
    }
}
