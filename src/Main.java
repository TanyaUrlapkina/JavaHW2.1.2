public class Main {
    public static void main(String[] args) {
        int account = 100;
        int accountReplenishment = 1200;
        int bonus = 0;
        if (bonus >= 1_000) {
            System.out.println("bonus = true");
        }

        bonus = accountReplenishment / 100;
        System.out.println(bonus + accountReplenishment + account);
    }
}
