import java.util.Arrays;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int numbers[] = new int[6];
        String words[] = new String[2];
        
        for (int i = 0; i < 6; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento del índice " + i));
        }

        // Showing data
        System.out.printf("The numbers are: \n");
        for (int i : numbers) {
            System.out.print(i + ", ");
        }

        // Showing order data
        System.out.printf("\nThe numbers ordered are: \n");
        Arrays.sort(numbers);
        for (int i : numbers) {
            System.out.print(i + ", ");
        }

        // Fill array
        Arrays.fill(words, "i dont make mistakes");

        System.out.print("Showing the data of string array: \n");
        for (String s : words) {
            System.out.print(s + ", ");
        }

    }
}
