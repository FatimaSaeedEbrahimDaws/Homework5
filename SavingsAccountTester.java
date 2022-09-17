public class SavingsAccountTester {

    public static void main(String[] args) {
     BankAccount s=new BankAccount(1000);
        s.addInsert(10);
        System.out.println("Resulting balance="+s.getbalance());
        System.out.println("Expected result="+1100);

    }



}
