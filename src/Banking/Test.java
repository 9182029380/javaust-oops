package Banking;

public class Test {
    public static void main(String[] args) {
            BankingAccount account = new FixedDepositAccount();
            account.deposit(1000);
            account.withdraw(500);
            account.getBalance();

    }
}
