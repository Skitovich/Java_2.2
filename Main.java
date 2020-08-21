public class Main {
    public static void main(String[] args) {
        int bill = 10000;
        int paymentBill = 100000;
        int bonus;

        if (paymentBill >= 100000) {
            bonus = paymentBill / 100;
        } else {
            bonus = 0;
        }

        int billAfterFill = bill + paymentBill + bonus;

        System.out.println(billAfterFill);
    }
}