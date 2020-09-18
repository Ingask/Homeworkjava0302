public class Main {
    public static void main(String[] args) {

        double amount = 558.99;
        double transfer = 9856.00;

        int bonus;
        double limit = 1000.00;
        if (transfer>=limit) {
            bonus = (int) transfer / 100;
        } else {
            bonus = 0;}

        double  balance =  amount + transfer + bonus;

        System.out.println(bonus);

        System.out.println(balance);

        }

    }

