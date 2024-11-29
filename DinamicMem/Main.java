import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Dinamic array
        ArrayList<String> cadenas = new ArrayList<String>();
        String frase, respuesta;

        do {
            frase = JOptionPane.showInputDialog(null, "Ingresa la frase: ");
            cadenas.add(frase); // Addign to array list

            respuesta = JOptionPane.showInputDialog(null, "Deseas agregar otra frase (SI/NO)?");
            respuesta = respuesta.toUpperCase();

        } while (!respuesta.equals("NO"));

        // Showing data
        for (int i = 0; i < cadenas.size(); i++) {
            System.out.println(cadenas.get(i));
        }

        // set method
        cadenas.set(1, "im ready to conquer the world"); // Nodify the index 1 to the new string

        // remove method
        cadenas.remove(2); // Removing the index 2 from the array list
    }

}