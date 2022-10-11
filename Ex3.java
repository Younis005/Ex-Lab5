public class Ex3 {
    private double balance;

    public Ex3(){
        balance=0;
    }

    public Ex3(double initial){
        balance=initial;
    }

    public void mystery(Ex3 that,double amount){
        this.balance-=amount;
        this.balance+=amount;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount<=balance)
            balance-=amount;
    }

    public void addintrest(double rate){
        balance+=(rate/100)*balance;
    }

    public double getBalance(){
        return balance;
    }
}
