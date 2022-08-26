package thirdweek;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Alphabet {
    public static List<Character> alphabetTR = List.of('a','b','c','ç','d','e','f','g','ğ','h','ı','i','j','k','l','m','n','o','ö','p','r','s','ş','t','u','ü','v','y','z');
    public static List<Character> alphabetEN = List.of('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','q','u','v','w','x','y','z');

    public static boolean isPangramTR(String sentence){ //1
        String currentSentenceAsLowerCaser = sentence.toLowerCase();
        for (char currentChar : alphabetTR) {
            String currentCharAsString = String.valueOf(currentChar);
            if (!currentSentenceAsLowerCaser.contains(currentCharAsString))
                return false;
        }
        return true;
    }

    public static boolean isPangramEN(String sentence){ //1
        String currentSentenceAsLowerCaser = sentence.toLowerCase();
        for (char currentChar : alphabetEN) {
            String currentCharAsString = String.valueOf(currentChar);
            if (!currentSentenceAsLowerCaser.contains(currentCharAsString))
                return false;
        }
        return true;
    }

    public static boolean isPalindrome(String sentence){ //2
        //karakterlerin türkçe olarak geleceği varsayıldı.
        String a = "";
        String sentenceAsLowerCase = sentence.toLowerCase();
        StringBuilder reverseString = new StringBuilder();

        for (int i = sentenceAsLowerCase.length()-1; i >= 0; --i) {
            char currentChar = sentenceAsLowerCase.charAt(i);
            if(alphabetTR.contains(currentChar))
                reverseString.append(currentChar);
        }
        String senctenceWithoutSpecials = reverseString.reverse().toString();

        return reverseString.toString().equals(senctenceWithoutSpecials);
    }

    public static String myStringBuilder(int n){ //4
        String[] stringList = new String[n];

        for (int i = 0; i < stringList.length; i++) {
            stringList[i] = getRandomString();

        }

        StringBuilder resultString = new StringBuilder();

        for(String currentString : stringList){
            resultString.append(currentString).append("-");
        }
        resultString.deleteCharAt(resultString.length()-1);

        return resultString.toString();
    }

    public static String getRandomString(){
        int stringLength = 30;
        //int charRange = 255;
        Random random = new Random();
        int size = random.nextInt(stringLength);
        StringBuilder resultString = new StringBuilder();

        for (int i = 0; i < size; i++) {
            resultString.append((char) random.nextInt(65,90));
        }

        return resultString.toString();
    }

    public static void main(String[] args) {
        System.out.println(isPangramEN("The quick brown fox jumps over the lazy dog"));
        System.out.println(isPangramTR("Pijamalı hasta yağız şoföre çabucak güvendi"));
        System.out.println(isPalindrome("ey edip Adana'da pide ye"));

        /** 3.ödev geçen haftanın Date sınıfı içerisinde yer alıyor.**/

        System.out.println(myStringBuilder(10));
    }
}
