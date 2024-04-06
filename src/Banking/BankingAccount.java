package Banking;

public interface BankingAccount {
   public void deposit(double amount);
   public  void withdraw(double amount);
   public double getBalance();
   default void internetbanking(){
       System.out.println("Internet banking");
   }

}
