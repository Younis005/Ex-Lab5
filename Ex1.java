public class Ex1 {
    private int count;
    private int limit;
    public Ex1(int limit){
        count=0;
        this.limit=limit;
    }

    public void click(){
        if (count<2)
            count++;
    }

    public void reset(){
        count=0;
    }

    public void undo(){
        if(count>0)
            count--;
    }

    public void setLimit(int limit){
        this.limit=limit;
    }

    public int getCount() {
        return count;
    }
}
