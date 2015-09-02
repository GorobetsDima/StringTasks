package com.Strings10Tasks;

/**
 * Task206: Дана строка. Определить, сколько раз входит в нее группа букв  abc .
 * Created by Gorobets Dmitriy on 17.08.2015.
 */
public class StringTask206 {
    String string = "Jhgsdfghabc idfjgjklabcikjk abc abcjhjk gfjhdjabkk abc123 ufhabcjkfk ";
    int numberSubString = 0;

    public int countStringAbc() {
        string = string.toLowerCase();
        String substring = "abc";
        substring = substring.toLowerCase();
        int index = string.indexOf(substring);
        while(index>=0){
            numberSubString++;
            index =string.indexOf(substring,index+1);
        }

        return numberSubString;
    }

}
