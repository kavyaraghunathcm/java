package org.example;

public class Main {
    public static void main(String[] args) {

    }

    public String reverseString( String str){

        String str2="";
        char[] chars= str.toCharArray();
        for (int i= chars.length-1;i>=0;i--) {
            str2.concat(String.valueOf(chars[i]));
        }
    }
}