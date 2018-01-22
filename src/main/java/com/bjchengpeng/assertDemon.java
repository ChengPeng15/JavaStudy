package com.bjchengpeng;

/**
 * Created by bjchengpeng on  2018/1/22.
 */

/**
 * 应避免使用assert
 * 断言不应该用于验证输入数据到一个public方法或命令行参数。
 * IllegalArgumentException会是一个更好的选择。在public方法中，只用断言来检查它们根本不应该发生的情况。
 */
public class assertDemon {
    public static void main(String[] args) {
        System.out.println( new assertDemon().computerSimpleInterest(1, 1.2f,1));
    }

    public int computerSimpleInterest(int principal,float interest,int years){
        assert(principal<0);
        return 100;
    }
}