package com.test.java;

import org.junit.Assert;
import org.junit.Test;

/**
 * author luoshuncun
 * date 2021-07-27-22:12
 */
public class TestHelloWorld {
    @Test
    public void testAddNumber(){
        System.out.println("测试HelloWorld的addNumber方法的第一种方法");
        HelloWorld hw = new HelloWorld();
        int i = hw.addNumber(50, 60);
        Assert.assertEquals(110,i);
    }
    @Test
    public void testAddNumber2(){
        System.out.println("测试HelloWorld的addNumber方法的第二种方法");
        HelloWorld hw = new HelloWorld();
        int i = hw.addNumber(200, 60);
        Assert.assertEquals(260,i);
    }
}
