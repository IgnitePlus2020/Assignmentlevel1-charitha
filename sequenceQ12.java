package com.tgt.igniteplus;

import java.util.Scanner;

public class sequenceQ12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of  n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
                System.out.print("-");
            System.out.print(i+" ");
        }
    }
}

