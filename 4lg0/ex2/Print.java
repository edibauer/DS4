public class Print {
    // att
    // meth
    public static String printRec(int number) {
        String r = "";

        // inductive
        if (number > 1) {
            r = number + printRec(number - 1);
        }

        // base
        if (number == 1) {
            r = "1";
        }
        return r;
    }
}