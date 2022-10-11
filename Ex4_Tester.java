public class Ex4_Tester {
    public static void main(String[] args) {
        Ex4 Account=new Ex4(1000,.10);
        Account.addInterest();
        System.out.println(Account.getBalance());
    }
}
