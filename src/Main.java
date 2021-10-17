public class Main {
    public static void main(String[] args) {
        int account = 100;
        int accountReplenishment = 1200;
        int bonus = 0;
        bonus = accountReplenishment / 100;
        if (accountReplenishment >= 1_000) {
            System.out.println(bonus + accountReplenishment + account);
        }
        else {
            System.out.println(accountReplenishment + account);
        }
    }
}