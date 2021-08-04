package com.example.demo.study.tuling.day1;

public class MathUtil {
    public static final int initData = 666;
    public static User user = new User();

    public int compute() {  //一个方法对应一块栈帧内存区域
        int a = 1;
        int b = 2;
        int c = (a + b) * 10;
        return c;
    }

    public static void main(String[] args) {
        ClassLoader mathClass = MathUtil.class.getClassLoader();
        System.out.println(mathClass);
        MathUtil math = new MathUtil();
        math.compute();
    }
}