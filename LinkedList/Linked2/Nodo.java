public class Nodo {
    public int data;
    public Nodo next;

    // constructor
    public Nodo(int d) {
        this.data = d;
    }

    // contructuor to add in the begin of the list
    public Nodo(int d, Nodo n) {
        this.data = d;
        this.next = n;
    }
}
