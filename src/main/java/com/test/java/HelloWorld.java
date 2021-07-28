package com.test.java;

/**
 * author luoshuncun
 * date 2021-07-27-22:10
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello,world");
        System.out.println(new HelloWorld().addNumber(10,20));

    }
    public int addNumber(int a,int b){
        return a+b ;
    }
}
