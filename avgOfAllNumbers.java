package com.example.lesson1;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/10/13
 * Time: 9:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class avgOfAllNumbers {
    public static void main(String[] args) {
        int avg, n = 5;
        sumOfAll sum = new sumOfAll(n);
        avg = sum.getSum() / n;
        System.out.println("The average of all numbers from 1 to " +n+ " = " +avg);
    }
}

