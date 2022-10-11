public class Ex1_tester {
    public static void main(String[] args) {
        Ex1 tallycounter=new Ex1(2);
        tallycounter.click();
        tallycounter.click();
        tallycounter.click();
        System.out.println(tallycounter.getCount());
        tallycounter.undo();
        tallycounter.undo();
        tallycounter.undo();
        tallycounter.undo();
        tallycounter.undo();
        System.out.println(tallycounter.getCount());
    }
}
