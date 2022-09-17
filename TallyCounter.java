public class TallyCounter {
    private   int value;

    /**
     * The default Counter initialize counter by zero.
     */    public TallyCounter()
    {
        value=0;
    }
    ////////////

    /**
     * Increase the counter value by one
     */
    public void click()
    {
        value=value+1;
    }
    /////////

    /**
     * Get the current value of the Counter.
     * @return current value of the counter
     */
    public int getValue(){
        return Math.max(value,0);
    }
    /////////////

    /**
     * start the counter value from zero
     */
    public void reset(){
        value=0;
    }
    ////////

    /***
     * loss the counter value by one
     */
    public void undo()
    {if (value>0)
        value=value-1;
    }

}
