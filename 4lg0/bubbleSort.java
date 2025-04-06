public class bubbleSort {
    public static void main(String[] args) {
        int[] arr_int = {5,1,4,2,8};
        int left_val = 0;
        int right_val = 0;

        for (int j = 0; j <= arr_int.length; j++) {
            
            for (int i = 0; i < arr_int.length - j; i++) {
                if ( i == (arr_int.length - 1 - j) ) {
                    continue;
                }
    
                left_val = arr_int[i];
                right_val = arr_int[i + 1];
    
                System.out.println(left_val);
                System.out.println(right_val);
    
                if ( left_val > right_val ) {
                    arr_int[i] = right_val;
                    arr_int[i + 1] = left_val;
                }
            }
        }
        
        for (int i = 0; i < arr_int.length; i++) {
            System.out.printf("[+] Sorted array: ");
            System.out.println(arr_int[i]);
        }
    }
}