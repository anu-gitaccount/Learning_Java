public class OOPS {
    public static void main(String[] args) {

        // object = an instance of a class that may contain attribute and method
        // Lets say we want to make a new class so make a new class file rather
        // than just doing it in the same file

        CarClass new_obj = new CarClass();

        System.out.println(new_obj.price);

        new_obj.start();

        // New class Object that can have different value to different obj

        Constructor_Class obj = new Constructor_Class(10, 20, '+');

        int add = obj.operation();
        System.out.println(add);

    }
}
