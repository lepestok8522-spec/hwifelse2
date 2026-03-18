public class Main {
    public static void main(String[] args) {
        int balans = 100;
        int amount = 1100;
        int bonus = 0;
        if (amount > 1000) {
            bonus = amount / 100;
        }
        balans = balans + amount + bonus;
        System.out.println("Итоговый счет: "+balans);
        System.out.println("Бонусы: " + bonus);
    }
}