package com.tgt.igniteplus;

import java.io.InputStreamReader;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class reversestring
{
    public static void main(String[] args)
    {
        String input = "";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        input=sc.nextLine();
        byte [] strAsByteArray = input.getBytes();
        byte [] result =
                new byte [strAsByteArray.length];
        for (int i = 0; i<strAsByteArray.length; i++)
            result[i] =
                    strAsByteArray[strAsByteArray.length-i-1];
        System.out.println(new String(result));
    }
}