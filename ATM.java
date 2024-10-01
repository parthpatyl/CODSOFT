public class ATM {
    final BankAccount account;

    public ATM(BankAccount account){
        this.account = account;
    }
    public void withdraw(double amount){
        if (amount > 0 && account.getBalance() >= amount){
            account.debit(amount);
            System.out.println("Debited successful. Current Balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient Balance available");
        }
    }

    public void deposit(double amount){
        if (amount > 0){
            account.credit(amount);
            System.out.println("Deposit Successful. New Balance: " + account.getBalance());
        } else {
            System.out.println("Deposit Failed");
        }
    }

    public void chkbalance(){
        System.out.println("Current Balance: "+ account.getBalance());
    }
}