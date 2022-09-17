public class TimeDepositAccount {
    //Q7
    private  double balance,rate;

    /***
     * default constructor.
     */

    /***
     * another constructor with initial balance
     * @param initialBalance the initial balance
     */
    public TimeDepositAccount(double initialbalance,double rate){
        balance=initialbalance;
        this.rate=rate;
    }
    public TimeDepositAccount(){
        this(0,0);}
    /**
     *
     * @param amount;
     */
    public void  withdraw(){

        balance=balance-balance;
    }

    /**
     * withdraw specific  amount of mony from the current account
     * @param amount
     * @return
     */
    public double  getbalance(){
        return balance;
    }
    public  void addInsert()
    {
        balance=balance+balance*(rate/100);
    }



}
