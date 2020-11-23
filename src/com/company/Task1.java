package com.company;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        // Сформировать строку, которая содержит 100 случайных значений от 0 до 1000, разделённых пробелами
        // (2 способа - String и StringBuilder).

        String strResult = "";
        int minBound = 0;
        int maxBound = 1000;
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int nextValue = rand.nextInt(maxBound - minBound) + minBound;
            strResult += nextValue + " ";
        }
        System.out.println(strResult);

        String strResult1 = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 100; i++) {
            int nextValue = rand.nextInt(maxBound - minBound) + minBound;
            stringBuilder.append(nextValue).append(" ");
        }
        System.out.println(stringBuilder);
    }

}

