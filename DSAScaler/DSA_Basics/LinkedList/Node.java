public class Node {
    // att
    public int data;
    public Node next; // reference to the next node (pointer) (Node like data type)

    // constructor
    public Node(int d, Node sig) {
        this.data = d;
        this.next = sig; // initialize next to null
    }

}