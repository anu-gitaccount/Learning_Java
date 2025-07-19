import java.lang.reflect.Array;
import java.util.*;

public class array_list {
    public static void main(String[] args) {

        // ArrayList = like a Vector
        //              resizable array - stores refrence data type


        //ArrayList<Integer> arr = new ArrayList<Integer>();

        ArrayList<String> food = new ArrayList<String>();

        food.add("burger");
        food.add("pizza");
        food.add("bread");

        // replace a element using set(index, new_element);
        food.set(0, "noodles");

        // .remove(index)  removes the element from the index
        food.remove(1);

        // .clear()  removes all the element
            //food.clear();

        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        ArrayList<ArrayList<Integer>> grid = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> num1 = new ArrayList<Integer>();
        num1.add(1);
        num1.add(2);
        num1.add(3);


        ArrayList<Integer> num2 = new ArrayList<Integer>();
        num2.add(4);
        num2.add(5);
        num2.add(6);

        ArrayList<Integer> num3 = new ArrayList<Integer>();
        num3.add(7);
        num3.add(8);
        num3.add(9);


        grid.add(num1);
        grid.add(num2);
        grid.add(num3);

        System.out.println(grid);


    }
}
