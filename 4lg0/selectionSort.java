public class selectionSort {
    public static void main(String[] args) {
        int[] arr_int = {8,50,91,36,4,78};
        int min = arr_int[0];
        int index_min = 0;
        // int index_min = 0;

        for (int j = 0; j < arr_int.length; j++) {
            min = arr_int[j];
            // System.out.println(min);

            for (int i = 0 + j; i < arr_int.length; i++) {

                if ( arr_int[i] < min ) {
                    min = arr_int[i];
                    index_min = i;
                }
            }
    
            // System.out.printf("[+] Min value: %d, index min: %d\n", min, index_min);
            arr_int[index_min] = arr_int[j];
            arr_int[j] = min;
        }

        for (int i = 0; i < arr_int.length; i++) {
            System.out.printf("[+] Sorted values: %d\n", arr_int[i]);
        }

    }
}