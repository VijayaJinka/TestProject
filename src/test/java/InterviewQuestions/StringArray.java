package InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class StringArray {
    public static void main(String[] args) {

//        String str = " Hello";
//        String output = "";
//        //char ch;
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//            output = ch + output;
//
//            System.out.println(output);
//
//        }
//
 // using method 2 we are reversing array

        StringBuilder str= new StringBuilder("Hello");

        str.reverse();
        System.out.println(str);


    }
    }