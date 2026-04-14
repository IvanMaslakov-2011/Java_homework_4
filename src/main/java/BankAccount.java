public class BankAccount {

    String accountNumber;
    String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName) {

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {

        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }


}
