import java.util.Scanner;

public class ModificatioBankAcountTest {
    public static void main(String[] args) {
        BankAccount b=new BankAccount(0);
        Scanner in=new Scanner(System.in);
        System.out.println("input number transaction:");
        System.out.println("1-deposit     2-withdrawal      3- QUery  4-eixt");
        int value ,n=1;
double balance=0;

            value=in.nextInt();
            while (value!=4)
            {++n;
                if (value==1) {
                    System.out.println("Input balance");
                    balance=in.nextDouble();

               b.deposit(balance);
                }
                if (value==2)
                {   System.out.println("Input balance");
                    balance=in.nextDouble();
                    b.withdraw(balance);
                      }
                if (value==3)
                {
                    System.out.println(b.getbalance());


                }
                value=in.nextInt();
b.deduct(n);
            }}
    }

