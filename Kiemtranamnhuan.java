package com.company;

import java.util.Scanner;

public class Kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn hãy nhập năm cần kiểm tra");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }else{
                    isLeapYear = true;
                }
            }
            if(isLeapYear){
                System.out.println(year +" is a leap year");
            }else{
                System.out.println(year+ " is NOT a leap year");
            }
        }
    }
}

