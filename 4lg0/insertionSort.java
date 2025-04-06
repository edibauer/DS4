public class insertionSort {
    public static void main(String[] args) {
        int[] arr_int = {5,1,4,2,8,3};
        int[] sorted_arr = new int[arr_int.length];
        int val = 0;

        sorted_arr[0] = arr_int[0];
        System.out.println(sorted_arr[0]);

        for (int i = 1; i < arr_int.length; i++) {
            val = arr_int[i];
            System.out.println(val);
            for (int j = i - 1; j >= 0; j--) {
                System.out.printf("Sorted: %d\n", sorted_arr[j]);
                if ( val < sorted_arr[j] ) {
                    sorted_arr[j + 1] = sorted_arr[j];
                    sorted_arr[j] = val;
                } else if ( val > sorted_arr[j] ) {
                    sorted_arr[j + 1] = val;
                    break;
                } 
            }
        }

        for (int i = 0; i < arr_int.length; i++) {
            System.out.printf("[+] Sorted items: %d\n", sorted_arr[i]);
        }
    }
}