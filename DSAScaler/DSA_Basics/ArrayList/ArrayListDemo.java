import java.util.ArrayList;
import java.util.List;


public class ArrayListDemo {
    public static void main(String[] args) {
        // Array list with diff objects
        /*
        ArrayList arr = new ArrayList<>();

        arr.add(Integer.valueOf(1));
        arr.add("Scaler");
        
        System.out.println(arr);
        */

        // Adding elements in defined index
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 4); // Inserts 3 at the 2nd index

        System.out.println(list);

        // Adding elements from anonther list 
        List<Integer> list2 = new ArrayList<>();
        list2.add(369);
        list2.addAll(list);

        System.out.println(list2);

        // Removing elements
        list.remove(1); // Removes the 2nd element
        list.remove(Integer.valueOf(1)); // Remove the object 1

        System.out.println(list);

        // Contains
        if(list2.contains(4)) {
            System.out.println("Yes 4 is present");
        }

        // Get element
        ArrayList<String> names = new ArrayList<>();

        names.add("Orbelin");
        names.add("Oribe");
        names.add("Oswaldo");

        System.out.println(names.get(1)); // Prints "Oribe"

        // for each
        for(String name : names) {
            System.out.println(name);
        }
        

    }
}
