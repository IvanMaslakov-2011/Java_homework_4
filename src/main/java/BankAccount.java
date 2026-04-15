public class BankAccount {

    public static void main(){

        BankAccount bankAccount1 = new BankAccount("1", "Vanya");
        bankAccount1.deposit(1000);
        bankAccount1.withdraw(100);
        bankAccount1.displayInfo();

    }

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

    public double getBalance() {
        return balance;
    }

    public void displayInfo(){
        System.out.println("Номер аккаунту: " + accountNumber + "\n Ім'я власника: " + ownerName + "\nБаланс: " + balance);
    }


}
