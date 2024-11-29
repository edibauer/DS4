import java.util.Arrays;

public class CustomObjectSort {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Ivan", 29, 1300.33);
        employees[1] = new Employee("Mary", 32, 1500.77);
        employees[2] = new Employee("John", 28, 1200.44);

        // sorting
        // Arrays.sort(employees);

        // printing sorted employees
        System.out.println(Arrays.toString(employees));
    }

    
}
