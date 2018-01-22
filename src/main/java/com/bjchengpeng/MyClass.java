package com.bjchengpeng;

/**
 * Created by bjchengpeng on  2018/1/17.
 */
public class MyClass {

    /**
     * 方法参数为“int ... value”，三个点表示value参数可选 并且这个参数不是一个，是一个参数数组，具体可以看main方法中的调用方式
     * 这里只作为例子，输出参数的值
     *
     * @param value 可选参数数组，调用时根据实际需要，可以缺省，可以指定，一个方法中只能有一个这样的参数项，并且只能在最后
     */
    public void showNumber(int... value) {
        // 输入参数不是null,注意：没有给定参数时候，value!=null
        if (value != null) {
            // 首先判断这个方法是否给定了参数，如果没有给，输出提示信息
            if (value.length == 0) {
                System.out.println("方法没有参数！");
            }
            // 如果给了参数，那么输出全部
            else {
                // 需要注意的是，value是一个数组，取值时候用遍历数组的方式进行
                for (int i = 0; i < value.length; i++) {
                    System.out.print(value[i] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("输入参数为null");
        }
    }

    /**
     * 程序入口，测试用
     *
     * @param args
     */
    public static void main(String[] args) {
        // 产生类实例
        MyClass mc = new MyClass();

        // 下面调用方法showNumber
        // 1.不给定参数
        mc.showNumber();

        // 2.给一个参数
        mc.showNumber(100);

        // 3.给多个参数
        mc.showNumber(100, 200, 300, 150, 600, 750);

        //4.参数输入为null
        mc.showNumber(null);

    }

}