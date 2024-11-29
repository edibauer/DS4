public class Lista {
    Node inicio;
    Node fin;
    int counter;

    // constructor
    public Lista() {
        this.inicio = null;
        this.fin = null;
    }

    // methods
    public boolean isEmpty() {
        if(this.inicio == null) return true;

        return false;
    }

    public void addInit(int dato) {
        counter++; // Cda vez que se agrega un nuevo nodo, se aumenta el contador en 1
        if( isEmpty() ) {
            this.inicio = new Node(dato, this.inicio); // Se inserta el dato y el siguiente apunta a null
            this.fin = this.inicio; // Si la lista está vacía, el inicio y el fin apuntan al mismo nodo
        } else {
            this.inicio = new Node(dato, this.inicio); // this.inicio vale el primer nodo ahora
        }
    }

    public void showList() {
        Node aux = this.inicio;// para recorrer la lista siempre se comienza desde el primer elemento
        while(aux != null) {
            System.out.print("[" + aux.data + "] --- "); // aux hace referencia al nodo creado. El data es, como tal, el dato que alamacena ese nodo
            aux = aux.next; // aux avanza al siguiente nodo, si no siempre apunta al mismo
        }
    }

    public int numberOfNodes() {
        return this.counter;
    }


}
