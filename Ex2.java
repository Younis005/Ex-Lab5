public class Ex2 {
   private int value;

   public int getValue(){
       return value;
   }

   public void click(){
       value =value+3;
   }

   public void unclick(){
       value = value-1;
   }

   public void reset(){
       value =0;
   }

   public void setLimit(int maximum){
       maximum = 10;
   }
}
