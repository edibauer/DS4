import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        HashMap<String, Integer> edades = new HashMap<>();

        // Adding elments
        edades.put("Juan", 21);
        edades.put("Ana", 30);
        edades.put("Pedro", 25);

        // Getting a value
        int edad = edades.get("Juan");
        System.out.printf("Juan is %d years old\n", edad);

        // Verifying if exists
        boolean is_ex = edades.containsKey("Ana");
        System.out.println(is_ex);

        // Removing an element
        // edades.remove("Ana");


    }

}