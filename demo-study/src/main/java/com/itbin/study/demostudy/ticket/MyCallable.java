package com.itbin.study.demostudy.ticket;

import java.util.concurrent.Callable;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/12/17 15:37
 * @description:
 * @modified By:
 */
public class MyCallable implements Callable<String> {

    private Integer totalTicket = 100;

    private Object object = new Object();

    @Override
    public String call() throws Exception {
        while (true) {
            synchronized (object) {

                Thread.sleep(100);

                if (totalTicket <= 0) {
                    break;
                } else {
                    totalTicket--;
                    System.out.println(Thread.currentThread().getName() + "--在买票，还剩下 " + totalTicket);
                }
            }
        }
        return "卖完了";
    }
}
