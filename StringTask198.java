package com.Strings10Tasks;

/**
 * Task198: Дана строка, заканчивающаяся точкой. Подсчитать, сколько в ней слов.
 * Created by Gorobets Dmitriy on 16.08.2015.
 */
public class StringTask198 {
    String st = "I want to travel around the world.";
    int numWords = 0;


    public int countWord() {
        String[] arrSt = st.split(" ");
        numWords = arrSt.length;

        System.out.println("Number of words = " + numWords);
        return numWords;
    }


}



