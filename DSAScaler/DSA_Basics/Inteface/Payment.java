public class Payment {
    // own method
    public static void makePayment(PaymentMethod pm) {
        pm.pay();
    } 
    public static void main(String[] args) {
        // DebitCard db = new DebitCard();
        PaymentMethod pm = new CreditCard();
        makePayment(pm);
    }
}
