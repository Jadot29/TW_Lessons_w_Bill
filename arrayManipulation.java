package com.example.lesson1;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/10/13
 * Time: 10:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class arrayManipulation {

    public static void main(String[] args) {
        String[] words = {"Three", "Four", "Five"};
        arrayManipulation findShortest = new arrayManipulation();
        System.out.println(findShortest.shortestString(words));


    }

    public String shortestString(String[] arrayString) {
        String shortest = null;
        for (int i = 0; i < arrayString.length - 1; i++) {
            boolean isCurrentLongerThanNext = arrayString[i].length() > arrayString[i + 1].length();
            if (isCurrentLongerThanNext) {
                shortest = arrayString[i + 1];
            } else {
                shortest = arrayString[i];
            }
        }

        return shortest;
    }

    //public int findAllOdd(int [] number)


}
