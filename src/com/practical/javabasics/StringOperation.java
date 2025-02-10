package com.practical.javabasics;

public class StringOperation {

    static void travesString(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch [] = str.toCharArray() ;
            System.out.println(ch[i]+" " );
        }
    }
    public static void main(String[] args) {
        String str1 = "GeeksforGeeks";
        travesString(str1);
    }
}
