package com.Strings10Tasks;

/**
 * Task199: Дана строка, содержащая английский текст. Найти количество слов, начинающихся с буквы b.
 * Created by Gorobets Dmitriy on 17.08.2015.
 */
public class StringTask199 {
    String string = "brother bothered me when I was a little boy!";
    int numberWords = 0;

    public int countWordWithB() {
        int length = string.length();
        if (string.charAt(0) == 'b') {
            numberWords++;
        }

        for (int i = 0; i < length; i++) {
            char c = string.charAt(i);


            switch (c) {

                case ' ':
                    if (string.charAt(i + 1) == 'b') {
                        numberWords++;

                    }
                    break;


            }
        }
        return numberWords;
    }
}






