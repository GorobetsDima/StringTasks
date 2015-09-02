package com.Strings10Tasks;

import java.util.Arrays;

/**
 * Task200: Дана строка. Подсчитать в ней количество вхождений букв r, k, t.
 * Created by Gorobets Dmitriy on 17.08.2015.
 */
public class StringTask200 {
    String str = "Adfhgfj hdhdrjrkr kjdkgfkvjhkr tkrtlrkrktrk ";

    public void countRKT() {

        int[] arr = new int[3];
        String[] arrSt = str.split("");
        for (String a : arrSt) {
            if (a.equals("r")) {
                arr[0]++;
            }
            if (a.equals("k")) {
                arr[1]++;
            }
            if (a.equals("t")) {
                arr[2]++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

}
