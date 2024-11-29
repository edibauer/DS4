public class Lista {
    // los punteros inicio y fin deben tener referencis, cabecer y cola
    protected Nodo inicio;
    protected Nodo fin;

    // constructor
    public Lista() {
        this.inicio = null;
        this.fin = null;
    }

    // method to know if linked list is empty
    public boolean isEmpty() {
        return this.inicio == null;
    }

    // method to add at begin of the list
    public void addFirst(int d) {
        Nodo nuevo = new Nodo(d, this.inicio); // Creating the new node. El puntero inici apunta al nuevo nodo, mientras que el nuevo nodo apunta a lo que tenia inicio, que es null
        this.inicio = nuevo;

        if (this.fin == null) {
            this.fin = nuevo;
        } // si la lista estaba vacía, el nuevo nodo es el último
    }

    // method to insert at the edn of the list
    

    // Method to show data
    public void showList() {
        Nodo actual = this.inicio; // comenzamos con el inicio

        while ( actual != null ) {
            System.out.print("[" + actual.data + "] ---");
            actual = actual.next; // avanzamos al siguiente nodo
        }
    }


}
