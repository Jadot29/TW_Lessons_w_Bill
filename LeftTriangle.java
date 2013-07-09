package com.example.lesson1;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/9/13
 * Time: 9:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class LeftTriangle {
    public static void main(String[] args) {
        int x = 5 ;
        for ( int i = 0 ; i < x ; i++)
        {
            System.out.print("\n*");
            for ( int n  = 0; n < i ; n++)
            {
                System.out.print("*");
            }

        }
    }
}
