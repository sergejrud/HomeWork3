package com.company;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        // Пользователь вводит имя и возраст. Вывести сообщение, приветствующее пользователя.
        // - форматирование (String.format) через спецификаторы
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String strForm = "Hello, %s. You look good despite your %ds.";
        String strOut = String.format(strForm, name, age);
        System.out.println(strOut);
    }
}
