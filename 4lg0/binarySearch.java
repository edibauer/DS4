public class binarySearch {
    public static void main(String[] args) {
        // vars
        int[] arr_int = {2,5,8,12,16,23,38,56,72};
        int low = 0;
        int high = arr_int.length;
        int middle = 0;
        int val = 0;
        int target = 23;
        
        for (int i = 0; i < arr_int.length; i++) {
            middle = (low + high) / 2;
            val = arr_int[middle]; // val of middle index

            if ( target == val ) {
                System.out.printf("[+] Index founded: %d\n", middle);
                break;
            } else if ( target > val) {
                low = middle + 1;
            } else if ( target < val ) {
                high = middle - 1;
            }
        }
    }
}