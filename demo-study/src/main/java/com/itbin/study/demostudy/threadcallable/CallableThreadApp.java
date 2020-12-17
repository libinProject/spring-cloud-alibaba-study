package com.itbin.study.demostudy.threadcallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/12/16 17:51
 * @description:
 * @modified By:
 */
public class CallableThreadApp {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();

        FutureTask<String> futureTask = new FutureTask<>(mc);

        Thread t1 = new Thread(futureTask);

        t1.start();

        String s = futureTask.get();
        System.out.println(s);

    }
}
