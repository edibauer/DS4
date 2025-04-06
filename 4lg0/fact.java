public class fact {
    // attr
    // meth
    public static int factorial(int n) {
        // vars
        int r = 0;

        // inductive
        if ( n > 1 ) {
            r = n * factorial(n - 1);
        }
        // base
        if ( n == 1 ) {
            r = 1;
        }

        return r;
    }
}