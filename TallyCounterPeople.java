public class TallyCounterPeople { private   int people;

    /**
     * The default Counter initialize counter by zero.
     */    public TallyCounterPeople()
    {
        people=0;
    }
    ////////////

    /**
     * Increase the counter people by one
     */
    public void click()
    {
        people=people+1;
    }
    /////////

    /**
     * Get the current people of the Counter.
     * @return current people of the counter
     */
    public int getValue(){
        return people;
    }
    /////////////

    /**
     * start the counter people from zero
     */
    public void reset(){people=0;
    }
    ////////

    /***
     * loss the counter people by one
     */
    public void undo()
    {if (people>0)
        people=people-1;
    }
   ///
   public   int setLimit(int maximum)
   {
return people= Math.min(people,maximum);


   }
}
