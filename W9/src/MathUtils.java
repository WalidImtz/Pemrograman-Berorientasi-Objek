// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils{
    //-------------------------------------------------------------
// Returns the factorial of the argument given
//-------------------------------------------------------------
    public static int factorial(int n){
        if (n < 0){
            throw new IllegalArgumentException("no factorial for negative");
        }
        int fac = 1;
        for (int i=n; i>0; i--)
            fac *= i;
        return fac;
    }
}