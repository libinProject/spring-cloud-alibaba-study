package com.itbin.study.demostudy;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/12/16 17:38
 * @description:
 * @modified By:
 */
public class ThreadApp {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();

    }
}
