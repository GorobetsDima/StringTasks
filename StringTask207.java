package com.Strings10Tasks;

/**
 * Task207:  Дана строка. Подсчитать количество букв k в последнем ее слове.
 * Created by Gorobets Dmitriy on 17.08.2015.
 */
public class StringTask207 {
    String str = "hjhfj jvkdjvk vjkdk lkkfgjk klkglg klklhlkghjkg";

    int numberOfK=0;
     public int countSymbolKinLastWord(){
         str = str.toLowerCase();
         String symbol = "k";
         String[] arrStr = str.split(" ");
         int i = arrStr[arrStr.length-1].indexOf(symbol);
         while(i>=0){
             numberOfK++;
             i = arrStr[arrStr.length-1].indexOf(symbol,i+1);
         }
         return numberOfK;
     }
}
