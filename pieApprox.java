package com.example.lesson1;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/10/13
 * Time: 9:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class pieApprox {

    public static void main(String[] args) {
             double sum = 0 ; int n = 1000000000;
        for (double i = 1; i <= n ; i+= 4)
        {
            sum+= 1/i;
        }

        for ( double i = 3 ; i<=n ; i+= 4)
        {
            sum-=1/i;
        }

        System.out.println("\nThe approximation of pi based on the formula " +
                "4 * (1 - 1/3 + 1/5 - 1/7 ...1/n) \n where n = " +n+ " is " +4*sum);
    }
}
