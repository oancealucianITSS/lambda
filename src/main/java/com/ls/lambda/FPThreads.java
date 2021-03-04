package com.ls.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.IntStream;

@SpringBootApplication
public class FPThreads {
    public static void main(String[] args) {
        SpringApplication.run(FPThreads.class, args);

//
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//          for(int i = 0; i< 10000; i++){
//
//              System.out.println(    Thread.currentThread().getId() + " : " +i);
//          }
//            }
//
//        };

        Runnable runnable = () -> IntStream.range(0,10000)
                .forEach( i -> System.out.println(Thread.currentThread()+" : " +i));

           
        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread(runnable);
        thread2.start();



    }
}
