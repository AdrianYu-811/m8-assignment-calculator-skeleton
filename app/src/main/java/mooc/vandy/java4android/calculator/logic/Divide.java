package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here
    public String divide(int arg1, int arg2) {
        String result= new String();
        result= arg1 / arg2 +" R: " + arg1 % arg2;// store results into results
        return result;// return the string
    }

}
