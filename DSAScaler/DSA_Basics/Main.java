import java.util.Arrays;

public class Main {

    // methods
    public static void f1() {
        int[] numbers = {18, 3, 15, 6, 12, 9};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void f2() {
        String[] fruits = {"orange", "grape", "apple", "lemon", "banana"};
        Arrays.sort(fruits);
        System.out.println("After sorting: " + Arrays.toString(fruits));
    }


    public static void main(String[] args) {
        // f1();
        // f2();

        // comparisons
        Employee employee1 = new Employee("Ivan", 29, 1300.33);
        System.out.println(employee1.age);
        
    }
}