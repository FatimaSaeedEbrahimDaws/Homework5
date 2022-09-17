import java.util.Scanner;

public class TimeDepositAccountTester {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       double balance;
        System.out.println("input balance :");
   balance=in.nextDouble();
    TimeDepositAccount time=new TimeDepositAccount(balance,5);
        System.out.println( time.getbalance());
    time.addInsert();
        System.out.println( time.getbalance());

        time.withdraw();
        System.out.println( time.getbalance());

    }
}
