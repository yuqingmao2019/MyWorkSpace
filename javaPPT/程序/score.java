package com.magoe.rabbitmq;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个数值");
        int number = sc.nextInt();

        if (number >= 90&&number<=100) {
            System.out.println("成绩为：优");
        } else if (number < 90 && number >= 80) {
            System.out.println("成绩为：良");
        } else if (number < 80 && number >= 70) {
            System.out.println("成绩为：中");
        } else if (number < 70 && number >= 60) {
            System.out.println("成绩为：及格");
        } else if (number < 60) {
            System.out.println("成绩为：不及格");
        } else {
            System.out.println("你输入的字符不和规范,没有这样的成绩");
        }
    }
}