package Banking;

public class FixedDepositAccount implements BankingAccount{
    private double balance;
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if(balance>=amount) {
            balance -= amount;
        }else  {
            System.out.println("Insufficient funds");
        }

    }

    @Override
    public double getBalance() {
        return balance;
    }
}
