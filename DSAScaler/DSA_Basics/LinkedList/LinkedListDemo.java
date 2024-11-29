public class LinkedListDemo {
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(6);

        a.next = b;

        System.out.println(a.data); // 3
        System.out.println(a.next.data); // 6
    }
}
