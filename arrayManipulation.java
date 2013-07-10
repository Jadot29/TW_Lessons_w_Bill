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
        String[] words = {"Three", "Four", "Two", "Five", "One", "Six", "Eight"};
        arrayManipulation find = new arrayManipulation();
        ArrayList<String> shortestWords = find.shortestString(words);
        System.out.println(shortestWords.toString());
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(find.findAllOddOrEven(numbers, 1));
        sumOfAll sum = new sumOfAll();
        sum.sumOfAllOdds(numbers);
        System.out.println("Sum of " + find.findAllOddOrEven(numbers, 1) + " = " + sum.getSum());
        ArrayList<Integer> productOfEvens = find.findAllOddOrEven(numbers, 0);
        System.out.println("The product of all evens: " + find.findAllOddOrEven(numbers, 0) + " is " + sum.productOfAll(productOfEvens));


    }

    public ArrayList<String> shortestString(String[] arrayString) {
        ArrayList<String> shortest = new ArrayList<String>();
        for (int i = 0; i < arrayString.length - 1; i++) {
            boolean isCurrentLongerThanNext = arrayString[i].length() > arrayString[i + 1].length();
            boolean isCurrentEqualToNext = arrayString[i].length() == arrayString[i + 1].length();
            if (isCurrentLongerThanNext) {
                shortest.remove(arrayString[i]);
                shortest.add(arrayString[i + 1]);
            } else if (isCurrentEqualToNext) {
                shortest.add(arrayString[i + 1]);
            } else {
                shortest.remove(arrayString[i]);
                shortest.add(arrayString[i]);
            }
        }

        return shortest;
    }

    public ArrayList<Integer> findAllOddOrEven(int[] numbers, int oddOrEven) {
        ArrayList<Integer> allOdds = new ArrayList<Integer>();
        ArrayList<Integer> allEven = new ArrayList<Integer>();
        for (int item : numbers) {
            if (item % 2 == 1) {
                allOdds.add(item);
            } else {
                allEven.add(item);
            }
        }
        if (oddOrEven == 1) {
            return allOdds;
        } else {
            return allEven;
        }
    }

}
