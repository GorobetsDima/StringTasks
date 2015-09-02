package com.Strings10Tasks;

/**
 * Task205: Дана строка. Преобразовать ее, удалив каждый символ * и повторив каждый символ, отличный от *.
 * Created by Gorobets Dmitriy on 17.08.2015.
 */
public class StringTask205 {
    String str = "12 345** 987*m*a *m* a*";

    public void changeString() {
        StringBuilder sb = new StringBuilder(0);
        for (char c : str.toCharArray()) {
            if (c != '*') {
                sb.append(c);
                sb.append(c);
            }

        }
        System.out.println('\n'+ sb.toString());

    }

}





