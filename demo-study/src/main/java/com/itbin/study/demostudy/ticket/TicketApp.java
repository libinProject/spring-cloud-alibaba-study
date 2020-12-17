package com.itbin.study.demostudy.ticket;

import java.util.concurrent.FutureTask;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/12/17 16:07
 * @description:
 * @modified By:
 */
public class TicketApp {

    public static void main(String[] args) {
        MyCallable myCallable = new MyCallable();
        FutureTask<String> futureTask1 = new FutureTask<>(myCallable);

        FutureTask<String> futureTask2 = new FutureTask<>(myCallable);

        FutureTask<String> futureTask3 = new FutureTask<>(myCallable);

        Thread t1 = new Thread(futureTask1);
        Thread t2 = new Thread(futureTask2);
        Thread t3 = new Thread(futureTask3);

        t1.start();
        t2.start();
        t3.start();
    }
}
