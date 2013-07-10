package com.example.lesson1;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/10/13
 * Time: 9:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class sumOfAll {
     private int sum  = 0;

    public static void main(String[] args) {
        sumOfAll sum = new sumOfAll(5);

    }

    public sumOfAll(){

    }
    public sumOfAll( int n )
    {
        n = 5;
        for ( int i = 1 ; i <= n; i++ )
        {
            sum+= i;
        }
        System.out.println("Sum of All numbers from 1 to " +n+ " is " +sum);
    }

    public void sumOfAllOdds(int[] numbers) {
        int sum = 0;
        arrayManipulation arrayManip = new arrayManipulation();
        ArrayList<Integer> odds;
        odds = arrayManip.findAllOddOrEven(numbers, 1 );
        for (int item : odds) {
            sum += item;
        }
    }
    public int productOfAll(ArrayList<Integer> numbers){
        int product = 1;
        for(int item: numbers) {
          product*=item;
     }
        return product;
    }


    public int getSum()
    {
        return sum;
    }
}
