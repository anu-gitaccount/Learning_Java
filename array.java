public class array {
    public static void main(String[] args) {
        // Array - Container that holds fixed number of elements

        //data_type[] arr_name = new data_type[size];
        int[] numbers = new int[5]; // Create array of 5 integer
        int[] num = {1, 2, 3, 4, 5}; // This is also we can create an array

        for (int i = 0; i < 5; i++) {
            numbers[i] = i + 1;
        }

        // This type of loopin is called for : each loop
        for (int n : numbers) {
            //System.out.println(n);
        }

        // Types of array (Multidimensional Array)
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        int[][] grid = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        //String[][] cars = new String[3][3];
        String[][] cars = {
                {"Audi", "Toyata"},
                {"Corvatte", "Tesla"},
                {"Maruti", "BMW"}
        };

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                //System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }




    }
}
