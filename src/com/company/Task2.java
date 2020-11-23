package com.company;

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
	// В сформированной в 1-ой задаче строке заменить все двузначные числа на -1. - RegEx - регулярные выражения
        String strResult = "";
        int minBound = 0;
        int maxBound = 1000;
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int nextValue = rand.nextInt(maxBound - minBound) + minBound;
            strResult += nextValue + " ";
        }
        System.out.println(strResult);

        String regex = "\\b\\d{2}\\b";
        String regexOut = strResult.replaceAll(regex, "-1");
        System.out.println(regexOut);
    }
}
