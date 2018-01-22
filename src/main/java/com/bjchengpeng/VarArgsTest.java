package com.bjchengpeng;

/**
 * Created by bjchengpeng on  2018/1/18.
 */

public class VarArgsTest {

    public void print(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public void print(String test) {
        System.out.println("----------");
    }

    public static void main(String[] args) {
        VarArgsTest test = new VarArgsTest();
        test.print("hello");
        test.print("hello", "alexia");
    }
}