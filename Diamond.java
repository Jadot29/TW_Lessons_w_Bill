package com.example.lesson1;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/9/13
 * Time: 12:08 PM
 * To change this template use File | Settings | File Templates.
 */

public class Diamond {

    public static void main(String[] args) {
        int x = 9;
        int inc = 0, inc1 = 1;
        System.out.println("x =  " + x);
        for (int i = 1; i <= x; i += 2) {
            drawLine(x, i, inc);
            inc++;
        }
        System.out.println("Jashaad");
        for (int l = x - 2; l > 0; l -= 2) {
            drawLine(x, l, inc1, "down");
            inc1++;
        }
    }

    private static void drawLine(int x, int l, int inc) {
        int spaces = (x / 2) - inc;
        for (int m = 0; m < spaces; m++) {
            System.out.print(" ");
        }
        for (int n = 0; n < l; n++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void drawLine(int x, int l, int inc, String down) {
        int spaces = inc;
        for (int m = 0; m < inc; m++) {
            System.out.print(" ");
        }
        for (int n = 0; n < l; n++) {
            System.out.print("*");
        }
        System.out.println();
    }


}


/*
  *
 ***
*****
 ***
  *
*/