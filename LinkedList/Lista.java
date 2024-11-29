public class Lista {
    private Nodo cabeza = null; // pude valer nulo si la lista esta vacía. Puede valer otro valor si la lista no está vacía

    private class Nodo {
        public Libro libro;
        public Nodo siguiente = null; // Don't know where is the pointer

        // constructor
        public Nodo(Libro libro) {
            this.libro = libro;
        }
    }

    // insertar al inicio de la lista
    public void insertarPrincipio(Libro libro) {

        Nodo nodo = new Nodo(libro); // Creación de un nuevo nodo a partir del que me estés diciendo
        nodo.siguiente = cabeza; // like nodo.siguiente = null
        cabeza = nodo; // El nuevo nodo ahora es la cabeza de la lista 

    }

    // insertar al final de la lista
    public void insertarFinal(Libro libro) {
        Nodo nodo = new Nodo(libro); // Creación del nuevo nodo

        // Si la cabeza is null, entonces no hya lista y la cabeza será le nuevo nodo que se acabca de crear
        if ( cabeza == null ) {
            cabeza = nodo;
        } else {
            Nodo puntero = cabeza; // Nodo especial al principio de la lista

            // Mientras puntero.siguiente sea distinto de null, seguiremos avanzando. El nodo final apunta a null
            while ( ... ) {
                puntero = puntero.siguiente;
            }
    
            // Cuando encuentre el último, hacemos que ese último apunte aora a lnuevo que se acaba de crear
            puntero.siguiente = nodo;
        }
    }
}
