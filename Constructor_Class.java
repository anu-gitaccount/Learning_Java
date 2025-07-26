import java.util.*;

public class Constructor_Class {
    // A Class That is more usefull than previous class
    // where we can make multiple obj for this class store different value in attributes
    // This class is about calculator
    Scanner scan = new Scanner(System.in);

    int operand1;
    int operand2;

    char opertaion;

    Constructor_Class(int num, int num1, char oper) {
        this.operand1 = num;
        this.operand2 = num1;
        this.opertaion = oper;
    }

    // Method to take User's input
    public void input() {

    }

    public int operation() {
        if (opertaion == '+') {
            return operand1 + operand2;
        }
        else if (opertaion == '-') {
            return operand1 - operand2;
        }
        else if (opertaion == '*') {
            return operand1 * operand2;
        }
        else if (opertaion == '/') {
            return operand1 / operand2;
        }
        else {
            System.out.println("Invalid Operation");
        }
        return 0;
    }


}
