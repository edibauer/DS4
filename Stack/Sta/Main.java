import java.util.Stack;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        Stack pila = new Stack();

        pila.push(3);
        pila.push(6);
        pila.push(9);

        System.out.println("The peek is: " + pila.peek());
        
    }
}