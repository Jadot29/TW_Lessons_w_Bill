package com.example.lesson1;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/10/13
 * Time: 10:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class arrayManipulation {

    public static void main(String[] args) {
        String[] words = {"Three", "Four", "Two" , "Five", "One", "Six", "Eight"};
        arrayManipulation find = new arrayManipulation();
        ArrayList<String> shortestWords = find.shortestString(words);
        System.out.println(shortestWords.toString());

        int [] numbers  = {1,2,3,4,5,6};
        System.out.println(find.findAllOdd(numbers));
        sumOfAll sum = new sumOfAll();
        System.out.println("Sum of " +find.findAllOdd(numbers)+ " = " +sum.sumOfAllOdds(numbers));




    }

    public  ArrayList<String> shortestString(String[] arrayString) {
        ArrayList<String> shortest = new ArrayList<String>();
        for (int i = 0; i < arrayString.length - 1; i++) {
            boolean isCurrentLongerThanNext = arrayString[i].length() > arrayString[i + 1].length();
            boolean isCurrentEqualToNext = arrayString[i].length() == arrayString[i + 1].length();
            if (isCurrentLongerThanNext) {
               shortest.remove(arrayString[i]);
                shortest.add(arrayString[i + 1]);
            }
            else if (isCurrentEqualToNext ){
                 shortest.add(arrayString[i+1]);
            }
            else {
                shortest.remove(arrayString[i]);
                shortest.add(arrayString[i]);
        }
        }

        return shortest;
    }

    public ArrayList<Integer> findAllOdd(int[] numbers){
            ArrayList<Integer> allOdds = new ArrayList<Integer>();
        for (int item: numbers){
          if (item%2==1) {
         allOdds.add(item);
      }
    }
        return allOdds;
    }

//    public ArrayList<Integer> printSumOfOdds(int[] numbers) {
//        ArrayList<Integer> allOdds = findAllOdd(numbers);
//        sumOfAll sum = new sumOfAll(allOdds);
//
//    }

}
