package com.bjchengpeng;

/**
 * Created by bjchengpeng on  2018/1/17.
 */
//public class VarArgsTest1 {
//
//    public void print(String test, Integer... is) {
//        System.out.println("Integer");
//    }
//
//    public void print(String test,String...args ){
//        System.out.println("String");
//
//    }
//
//    public static void main(String[] args) {
////        VarArgsTest1 test = new VarArgsTest1();
//////        test.print("hello");
//////        test.print("hello", null);
////        test.print("hello",1);
////        test.print("hello","1");
//
//
//
//        VarArgsTest1 test = new VarArgsTest1();
//        String[] strs = null;
//        test.print("hello", strs);
//
//
//    }
//}


//public class VarArgsTest1 {
//
//    public void print(String... args) {
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
//    }
//
//    public void print(String test,String...args ){
//        System.out.println("----------");
//    }
//
//    public static void main(String[] args) {
//        VarArgsTest1 test = new VarArgsTest1();
//        test.print("hello");
//        test.print("hello", "alexia");
//    }
//}


public class VarArgsTest1 {

    public void print(String test, Integer... is) {

    }

    public void print(String test, String... args) {

    }

//    public static void main(String[] args) {
//        VarArgsTest1 test = new VarArgsTest1();
//        test.print("hello");
//        test.print("hello", null);
//    }

    public static void main(String[] args) {
        VarArgsTest1 test = new VarArgsTest1();
        String[] strs = null;
        test.print("hello", strs);
    }
}