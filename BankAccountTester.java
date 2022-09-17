public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.deposit(1000);
        b.withdraw(500);
        b.withdraw(400);
        System.out.println("The expected result=100");
        System.out.println(b.getbalance());
    }

}
