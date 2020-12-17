package com.itbin.study.demostudy;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/12/16 17:37
 * @description:
 * @modified By:
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程启动：" + i);
        }
    }
}
