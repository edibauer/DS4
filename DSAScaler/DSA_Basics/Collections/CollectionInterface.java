import java.util.*;

public class CollectionInterface {
    public static void main(String[] args) {
        Collection<String> s1 = new ArrayList<String>();
        s1.add("Hello");
        s1.add("World");

        Collection<String> s2 = new HashSet<String>();
        s2.add("A");
        s2.add("B");
        s2.add("C");

        System.out.println(s1);
        System.out.println(s2);
    }
}