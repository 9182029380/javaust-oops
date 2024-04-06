package ExceptionHandling;

public class BankAccount {
    public  double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        try{
            if (amount<=0){
                throw new IllegalArgumentException("Amount must be positive");
            }
            if (amount>balance){
                throw new InsufficientFundsexception("Insufficient funds");
            }
            balance-=amount;
            System.out.println("Withdrawal successful"+"your current balance"+balance);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch(InsufficientFundsexception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Thank you for banking with us");
        }

    }


}
