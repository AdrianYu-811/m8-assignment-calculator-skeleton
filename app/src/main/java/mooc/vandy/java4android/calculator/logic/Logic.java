package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here
        switch (operation) {//identify the type of operation
            case 1: Remainder addition = new Remainder();
                addition.remainder(argumentOne, argumentTwo);// call the add function
                break;

            case 2: Subtract subtraction = new Subtract();
                subtraction.subtract(argumentOne, argumentTwo);// call the subtract function
                break;

            case 3: Multiply multiplication = new Multiply();
                multiplication.multiply(argumentOne, argumentTwo);// call the multiply function
                break;

            case 4: Divide division = new Divide();
                division.divide(argumentOne, argumentTwo);// call the divide funtion

        }
    }
}
