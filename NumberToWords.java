package com.example.lesson1;
import java.io.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/10/13
 * Time: 2:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class NumberToWords {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Input a number");
        NumberToWords number = new NumberToWords(input.nextInt());
        System.out.println(number.getNumberString());

    }
    private String numberString;

    public NumberToWords(int number) {
        switch (number) {
            case 1:
                numberString = "ONE";
                break;
            case 2:
                numberString = "TWO";
                break;
            case 3:
                numberString = "THREE";
                break;
            case 4:
                numberString = "FOUR";
                break;
            case 5:
                numberString = "FIVE";
                break;
            case 6:
                numberString = "SIX";
                break;
            case 7:
                numberString = "SEVEN";
                break;
            case 8:
                numberString = "EIGHT";
                break;
            case 9:
                numberString = "NINE";
                break;
            case 10:
                numberString = "TEN";
                break;
            default:
                numberString = "MANY";
                break;
        }
    }

    public String getNumberString() {
        return numberString;
    }
}
