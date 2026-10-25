package com.company;
import java.util.*;
public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects : ");
        int[] n = new int[5];
        int marks = 0;
        boolean f=true;
        for (int i = 0; i < 5; i++) {
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            marks = marks + n[i];
        }
        System.out.println("Total = " + marks + "/500");
        int result = 100 * marks / 500;
        System.out.println("Result = " + result + "%");

            for (int i = 0; i < 5; i++) {
                if (n[i] < 33) {
                  f=false;
                  break;
                }

            }
if(f){
    System.out.println("Result = pass");
}
else{
    System.out.println("Result = fail");
}
        }
    }

