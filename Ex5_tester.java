public class Ex5_tester {
    public static void main(String[] args) {
        Ex5 account=new Ex5(1000);
        account.deposits(1000);
        account.withdraw(500);
        account.withdraw(400);
        double result = account.getBalance();
        System.out.println("results: "+result);
    }
}
