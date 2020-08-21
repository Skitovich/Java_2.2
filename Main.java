public class Main {
    public static void main(String[] args) {
        int bill = 10000;                         // Последние две цифры это копейки
        int paymentBill = 1000;                   // Последние две цифры это копейки
        int bonus;

        if (paymentBill >= 1000) {
            bonus = paymentBill / 100;
        } else {
            bonus = 0;
        }

        int billAfterFill = bill + paymentBill + bonus;

        System.out.println(billAfterFill);
    }
}

    