public class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void credit(double amount){
        this.balance += amount;
    }
    public void debit(double amount){
        this.balance -= amount;
    }
}