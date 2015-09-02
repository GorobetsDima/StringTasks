package com.Strings10Tasks;

import java.util.Arrays;

/**
 * Task201: Дана строка. Определить, сколько в ней символов  * ,  ; ,  : .
 * Created by Gorobets Dmitriy on 17.08.2015.
 */
public class StringTask201 {
    String str = "A*dfh: g***fj; hdhdr j;;rkr kjdkg;f kv:: jhkr tkrtl;;r kr::k tr*k ";

    public void FindNumberOfSimbols() {

        int[] arr = new int[3];
        String[] arrSt = str.split("");
        for (String a : arrSt) {
            if (a.equals("*")) {
                arr[0]++;
            }
            if (a.equals(";")) {
                arr[1]++;
            }
            if (a.equals(":")) {
                arr[2]++;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}

