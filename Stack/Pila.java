public class Pila {
    int[] vectorPila;
    int cima;

    // Constructot
    public Pila(int tamanio) {
        this.vectorPila = new int[tamanio]; // Array declarate
        this.cima = -1; // The firs element of the array is 0
    }

    // Mehtods
    public void push(int dato){
        this.cima++; // the first element must have index 0
        vectorPila[cima] = dato; // array[0] = dato
    }

    public int pop() {
        int out = vectorPila[cima]; // Saves the element that we have to get
        cima--; // The nyumber of elements decreases when poping an element of the array
        return out;
    }

    public boolean isEmpty() {
        return cima == -1; // If the first index is -1, the stack is empty
    }

    public boolean isFull() {
        return cima == vectorPila.length - 1; // If the last index is the same as the size of the array, the stack is full
    }

    public int getPeek() {
        return vectorPila[cima]; // Returns the element at the top of the stack without removing it
    }

    public int getSize() {
        return vectorPila.length; // Returns the size of the array
    }
}