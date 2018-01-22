package com.bjchengpeng;

/**
 * Created by bjchengpeng on  2018/1/17.
 */
public class VariableParameter {

    public static void main(String[] args) {
        new VariableParameter().print();
        new VariableParameter().print("rubby");
        System.out.println();
        new VariableParameter().print("rubby", "python");
        System.out.println();
        new VariableParameter().print("rubby", "python", "java");
        System.out.println();
    }

    public void print(String... args) {
        if (args.length == 0)
            System.out.println("don't have any parameter");
        for (String temp : args) {
            System.out.print(temp + "\t");
        }
    }

    public void print(String args,String aa) {
        System.out.print(args + aa);
    }


//    public void add(int... params) {
//        int result = 0;
//        for (int param : params) {
//            result += param;
//        }
//    }
//
//    public void add(int[] params) {
//        int result = 0;
//        for (int param : params) {
//            result += param;
//        }
//    }




}