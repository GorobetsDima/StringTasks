package com.Strings10Tasks;

/**
 * Task202: Дана строка, содержащая текст. Найти длины самого короткого и самого длинного слов.
 * Created by Gorobets Dmitriy on 17.08.2015.
 */
public class StringTask202 {
    String str = "ds ghsdghs dkhlh jk;sdfgh:sdh fghs dfhbash v2g";

    public void findLengthOfWords() {
        String[] arrSt = str.split(" ");
                int[] arr = new int[arrSt.length];
                for (int i = 0; i < arrSt.length; i++) {
                    arr[i] = arrSt[i].length();

                }
                for (int barrier = 0; barrier < arr.length; barrier++) {
                    for (int index = barrier + 1; index < arr.length; index++) {
                        if (arr[barrier] > arr[index]) {
                            int tmp = arr[barrier];
                            arr[barrier] = arr[index];
                            arr[index] = tmp;


                        }


            }
        }
        int maxLength = arr[arr.length - 1];
        int minLength = arr[0];

        System.out.println("Length of shortest word=" + minLength + " ,length of longest word=" + maxLength);
    }
}
