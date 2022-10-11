public class Ex4 {
    private  double balance;
    private  double interest;

    public Ex4(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public Ex4(double balance) {
        this.balance = balance;

    }

    public Ex4(){
        balance=0;
    }

    public void withdraw(double amount){
        balance=balance-amount;
    }

    public void deposit(double amount){
        balance=balance+amount;
    }

    public double getBalance() {
        return balance;
    }
    public void addInterest(){
        double inter=balance*interest/100;
        balance=balance+inter;
    }
}
