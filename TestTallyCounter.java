import java.util.Scanner;

public class TestTallyCounter {
    public static void main(String[] args) {
        int value ;
        Scanner in=new Scanner( System.in);
  TallyCounter click=new TallyCounter();
        System.out.println("Press 1 to counting or -1 to undo or 0 to resent. (after ended press 2 to exit):");
        value=in.nextInt();
        while (value!=2)
        {
     if (value==1) {
         click.click();
         System.out.println("the value "+click.getValue());
     }
     if (value==0) {
         click.reset();
         System.out.println("the value "+click.getValue());     }
     if (value==-1)
     {
         click.undo();
         System.out.println("the value "+click.getValue());
     }
            value=in.nextInt();
}}}
