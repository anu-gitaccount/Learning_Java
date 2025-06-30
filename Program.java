//import java.util.*;
import java.util.Scanner;

// Importing a GUL lib known as Javax.swing.JOptionPane
import javax.swing.JOptionPane;

public class Program {
    public static void main(String[] args) {
        // Primitive Data Types -> byte, short, int, long, float, double, char, boolean;

        /*
        int x;  // Declartion
        x = 28; // Assignment
        int y = 20; // Initialization
        System.out.printf("X : %d, Y : %d\n", x, y);
        int temp = x;
        x = y;
        y = temp;
        System.out.printf("X : %d, Y : %d\n", x, y);
        // Scanner Class (Taking Input)
        // import Scanner class and make a object
        Scanner scan = new Scanner(System.in);
        // First method nextLine() -> Takes input String
        System.out.println("Enter Your Name : ");
        String name = scan.nextLine();
        // Next method is take input of int using nextInt();
        System.out.println("Enter Your Age : ");
        int age = scan.nextInt();
        // I have to use nextLine() to take input again
        scan.nextLine();
        System.out.println("Enter Something");
        String some = scan.nextLine();
        System.out.println("Your Name : " + name);
        System.out.println("Your Age : " + age);
        System.out.println("Something  " + some);
        */

        // To make a Simple GUL Dialoge Box
        // To take Input Something in GUI static method showInputDialog()
        String name1 = JOptionPane.showInputDialog("Enter Your Name");

        // To display Something use showMessageDialoge
        JOptionPane.showMessageDialog(null, "Hello" + name1);

        // To take integer We have to parse it from str to int
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));






    }
}