public class Ex5 {
   private double balance;

    public Ex5(double balance) {
        this.balance = balance;
    }

    public void deposits(double amount){
        balance=balance+amount;
    }

    public void withdraw(double amount){
        balance=balance-amount;
    }

    public double getBalance() {
        return balance;
    }
}
