public class CashRegister {
    private  double purchase,payment;
    public  CashRegister(){
        purchase=0;
        payment=0;
    }int n;double array[]={0};
    public   void recodppurchase(double price)
    {
        for (n=0;;n++)
        {
            array[n]=price;
        purchase=purchase+price;

    }}

    public    void  recievePayment(double price)
    {

        payment=payment+price;

    }
    public double givechange()
    {
        double change =payment-purchase;
        purchase=0;
        payment=0;
        return change;
    }
    public void printReceipt()
    {
        for (int b=0;b<=n;b++)
        {
            System.out.println("       "+array[b]);

    }
        System.out.println("------------------------");
        System.out.println("purchase"+purchase);
        System.out.println("payment"+payment);}
public  void concat(double price)
{
    String.valueOf(price);

}
}

