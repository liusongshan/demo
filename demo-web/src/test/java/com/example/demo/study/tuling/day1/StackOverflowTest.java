package com.example.demo.study.tuling.day1;

import java.util.ArrayList;
import java.util.List;

// JVM设置  -Xss128k(默认1M)
public class StackOverflowTest {
    
    static int count = 0;
    
    static void redo() throws InterruptedException {
        count++;
        redo();
    }

    public static void main(String[] args) throws InterruptedException {
//        try {
//            redo();
//        } catch (Throwable t) {
//            t.printStackTrace();
//            System.out.println(count);
//        }
        List<User> users  = new ArrayList<>();
        Thread.sleep(3000);
        while (true) {
            User user = new User();
            users.add(user);
            Thread.sleep(200);
        }

    }
}