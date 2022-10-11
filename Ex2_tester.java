public class Ex2_tester {
    public static void main(String[] args) {
        Ex2 tally=new Ex2();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        int result = tally.getValue();
        System.out.println("results: "+result);
    }
}
