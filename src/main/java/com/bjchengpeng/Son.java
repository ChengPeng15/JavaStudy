package com.bjchengpeng;

/**
 * Created by bjchengpeng on  2018/1/17.
 */
public class Son extends Father{
    @Override
    public void Hello(String[] str){
        System.out.println("Son Hello"+str);
    }

    public static void main(String[] args) {
        Father f = new Son();
        f.Hello("str");


//        Son son = new Son();
//        son.Hello("str");
    }
}