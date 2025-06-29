// import java.util.*;

import java.util.Scanner;
import java.util.Random;


public class math_lib {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = 20.10;
        double y = -15.09;

        // Math.max/min finds max and min of two val
        double z = Math.max(y, x);
        double p = Math.min(x, y);

        System.out.println("Max Value : "+ z);
        System.out.println("Min Value : "+ p);

        // Other methods are ciel , abs, floor, round

        // Lets Create a Program to find third side of triange
        /*
        System.out.println("Enter First side of triangle ");
        double a = scan.nextDouble();
        System.out.println("Enter Second side of triangle ");
        double b = scan.nextDouble();

        double c = Math.sqrt((a*a) + (b*b));

        System.out.println("The third side : "+ c);
        */

        // Genarting Random Value through Random lib
        // Create a obj of Random Class

        Random random = new Random();

        int random_num = random.nextInt();
        double double_random = random.nextDouble();

        System.out.println(random_num);


        // Conditionals in Java
        int age = 18;

        if (age >= 75) {
            System.out.println("You are Old");
        }
        else if (age >= 50) {
            System.out.println("You are Middle aged");
        }
        else if (age >= 25){
            System.out.println("You are Man");
        }
        else if (age >= 18){
            System.out.println("You are Teen");
        }
        else {
            System.out.println("You are Child");
        }

        // Switches in Java


        scan.close();;
    }
}
