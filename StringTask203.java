package com.Strings10Tasks;

/**
 * Task203:Дана строка символов, среди которых есть двоеточие (:). Определить, сколько символов ему предшествует.
 * Created by Gorobets Dmitriy on 17.08.2015.
 */
public class StringTask203 {
    String str = "ds ghsdghs dkhlh jk;sdfgh:sdh fghs dfhbash vg";


    public int numberOfSymbols() {
        String[] arrSt = str.split(":");
        int num = arrSt[0].length();

        return num;
    }



}



