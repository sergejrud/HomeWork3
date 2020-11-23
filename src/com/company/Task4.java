package com.company;

public class Task4 {

    public static void main(String[] args) {
        // Разбить строку на отдельные слова и посчитать количество вхождений для каждого слова.
        // - через split - будет считать разделителем пробел
        String str = "NO GOD! NO GOD, PLEASE NO, NO, NO, NOOOOO!";
        System.out.println(str);
        String regex = "[.,!:;?]";
        String format = str.replaceAll(regex, " ");
        String[] split = format.split(" ");

        for (int i = 0; i < split.length; i++) {
            int count = 1;
            if (split[i] == null) {
                continue;
            }
            for (int j = i + 1; j < split.length; j++) {
                if (split[i].equalsIgnoreCase(split[j])) {
                    split[j] = null;
                    count++;
                }
            }
            System.out.println("The word \"" + split[i] + "\" repeats  for " + count + " times.");
        }
    }
}
