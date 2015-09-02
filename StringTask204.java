package com.Strings10Tasks;

/**
 * Task204: Дана строка, содержащая текст, заканчивающийся точкой. Вывести на экран слова, содержащие три буквы.
 * Created by Gorobets Dmitriy on 17.08.2015.
 */
public class StringTask204 {
    String str = "Dsd ghsd Ghs dkhlh jk;sd Fgh : Sdh fghs Dfh bash lvg.";


    public void numberOfSymbols() {
        String[] arrSt = str.split(" ");
        for (String s : arrSt) {
            if(s.length()==3){
                System.out.print(s+" ");
            }



        }
    }
}