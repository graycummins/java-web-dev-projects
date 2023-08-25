package org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String myString;

        System.out.println("Enter a word or sentence (press ENTER when finished)");

        myString = input.nextLine();
        String uppercaseString = myString.toLowerCase();

        char[] charactersInString = uppercaseString.toCharArray();

        HashMap<Character, Integer> wordChar = new HashMap<>();

        int i =0;
        do{
            Character someChar = Character.valueOf(charactersInString[i]);

            Boolean str = wordChar.containsKey(someChar);

            if(str && Character.isLetter(someChar)) {
                int oldNum = wordChar.get(someChar);
                int newNum = oldNum+1;

                wordChar.replace(someChar, oldNum, newNum);
            }
            else if (Character.isLetter(someChar)) {
                wordChar.put(someChar,1);
            }

            i++;
        }while(i<charactersInString.length);

        System.out.println(wordChar.entrySet());
    }
}