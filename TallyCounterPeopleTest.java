import java.util.Scanner;

public class TallyCounterPeopleTest {

    public static void main(String[] args) {
        int people,p1;
        Scanner in=new Scanner( System.in);
        TallyCounterPeople click=new TallyCounterPeople();
        System.out.println("Input number set people:");
        p1=in.nextInt();
        System.out.println("Press 1 to counting or -1 to undo or 0 to resent. (after ended press 2 to exit):");
      people=in.nextInt();
      while (people!=2)
        {
            if (people==1) {


                click.click();
                System.out.println("the people "+click.setLimit(p1));}




            if (people==0) {
                click.reset();
                System.out.println("the people "+click.getValue());     }
            if (people==-1)
            {
                click.undo();
                System.out.println("the people "+click.getValue());
            }
            people=in.nextInt();
        }
}}
