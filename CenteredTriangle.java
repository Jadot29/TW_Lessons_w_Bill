package com.example.lesson1;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/9/13
 * Time: 11:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class CenteredTriangle {
    public static void main(String[] args) {
        int x = 30;
        for (int i = 1; i < x; i+=2) {
            for ( int j =0 ; j < x - i/2 ; j++){
                System.out.print(" ");
            }
                for (int n = 0; n < i; n++) {
                    System.out.print("*");
                }
            System.out.println();
            }
        }
}
