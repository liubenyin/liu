package com.sict.test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Helloo_lby {
    public static void main(String[] args) {
        System.out.println("奉我为主");
        double d1=3.15423675;
        double d2=15.203145987;
        DecimalFormat df = new DecimalFormat("#.000");

        String re1 = df.format(d1);
        String re2 = df.format(d2);
        System.out.println(re1);
        System.out.println(re2);

        /*Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个");
        double a= (double) sc.nextFloat();
        System.out.println("第二个数");
        double b=(double) sc.nextFloat();
        double se=cheng(a,b);*/

    }
    /*public static double cheng(double a,double b) {
        double d = a * b;
       // System.out.println(d);
        System.out.println(d);
        return d;

    }*/

    }
