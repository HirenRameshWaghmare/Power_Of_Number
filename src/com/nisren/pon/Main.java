package com.nisren.pon;

public class Main {

    /**
     * Q. Program to calculate power of a number using recursion?
     *
     * 1.Unintentional/Invalid input       -> -ve input or Decimal input 2.2
     * 2.Base Case/Termination Case        -> n = 0 or n = 1
     * 3.Recursive Case                    -> method call itself
     *
     * x^n=x*x*x*x...
     * 2^5=2*2*2*2*2
     * x^a*x^b=X^(a+b)
     * x^3*x^4=x^3+4
     * x^n=x*x^(n-1)
     */
    public static void main(String[] args) {
        Main recursion = new Main();
        int ret = recursion.powerOfNumber(2,3);
//      For Decimal input
//      int  ret = recursion.powerOfNumber((int)2.3,(int)3.2);
        System.out.println(ret);

    }
    public int powerOfNumber(int baseNumber, int exponentialNumber){
        //For Unintentional/Invalid input
        if (exponentialNumber<0){
            return -1;
        }
        //Base Case/Termination Case
        if (exponentialNumber == 0 || exponentialNumber == 1){
            return baseNumber;
        }
        //Recursive Case
        return baseNumber * powerOfNumber(baseNumber, exponentialNumber-1);
    }

}
