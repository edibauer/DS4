public class factorial {
    //att
    // meth
    public static int sumFactorial( int n ) {
        int r = 0;

        // inductive
        if (n > 1) {
            r = n + sumFactorial(n - 1);
        }

        if (n == 1) {
            r = 1;
        }
        // base
        return r;
    }
}