public class Ex3_tester {
    public static void main(String[] args) {
        Ex3 account=new Ex3(1000);
        account.deposit(500);
        account.withdraw(1000);
        account.addintrest(50);
        account.mystery(account,250);
        System.out.println(account.getBalance());
    }
}
