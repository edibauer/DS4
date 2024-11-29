import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int listSize = 0;
        LinkedList lista = new LinkedList();
        int i = 0;

        lista.add(9);
        lista.add(3);
        lista.add(6);
        listSize = lista.size();

        while ( i < listSize ) {
            System.out.println("[" + lista.get(i) + "]---");
            i++;
        }

    }
}