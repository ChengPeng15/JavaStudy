package com.bjchengpeng;

/**
 * Created by bjchengpeng on  2018/1/17.
 */
public class Variable {
    public static void print(String a, String... strings) {
        System.out.println(a);
        for (String str : strings) {
            System.out.println(str);
        }
    }

//    public static void print(String... strings) {
//        for (String str : strings) {
//            System.out.println(str);
//        }
//    }

    public static void main(String[] args) {
        print("123", "456","789");
    }

}