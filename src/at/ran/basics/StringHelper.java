package at.ran.basics;

import java.util.Scanner;

public class StringHelper {

    public static void main(String[] args) {
        isPalindrome("hansi");
    }

    public static boolean isPalindrome(String text){
        // 0 1 2 3
        // P a u l

        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            char remember = arr[i];
            arr[i] = arr[arr.length-1 -i];
            arr[arr.length-1 -i] = remember;


        }
        return false;
    }

    public static int countLetters(String text, char search){
        //Hans
        char[] textArray = text.toCharArray();
        int count = 0;

        // 0 1 2 3
        // H a n s

        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i]==search){
                count++;
            }
        }

        return count;
    }


}
