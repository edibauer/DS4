public class Stack {
    // att
    private NodePila peek;
    int size;

    // contructor
    public Stack() {
        this.peek = null; // The begin of the stack is null
        this.size = 0; // The stack has not elements yet, then its size is zero
    }

    // methods
    public boolean isEmpty() {
        return this.peek == null;
    }

    public void push(int element) {
        NodePila nuevo = new NodePila(element);
        nuevo.next = this.peek; // references null, because the new node references to peek = null in the att
        this.peek = nuevo; // The new node becomes the top of the stack
        size++; // Increment
    }

    public int pop() {
        int aux = this.peek.dato; // nuevo.dato
        this.peek = this.peek.next; // The next node becomes the top of the stack and references to null
        size--;

        return aux;
    }

    public int peek() {
        return this.peek.dato; // Returns the top element of the stack
    }

    public int size() {
        return this.size; // Returns the number of elements in the stack
    }

    public void clean() {
        while ( !isEmpty() ) {
            pop();
        }
    }
}
