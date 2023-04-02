public class Main {
    public static void main(String[] args) {
        int initialbalance = 100;
        int addend = 1200;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }

        int finalBalance = initialbalance + addend + bonus;
        System.out.printf("Баланс после пополнения: " + finalBalance);
        System.out.printf(" Начисленные бонусы: "  + bonus);


    }
}