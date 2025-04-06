public class mainFactorial {
    public static void main(String[] args) {
        int number = 12345;
        String str_number = String.valueOf(number);
        char[] arr_number = str_number.toCharArray();
        int ans = 0;
        int digit = 0;

        for (int i = 0; i < arr_number.length; i++) {
            // System.out.println((int)arr_number[i]);
            digit = arr_number[i] - '0'; // pass char to int
            ans = factorial.sumFactorial(digit);
        }

        System.out.println(ans);
    }
}