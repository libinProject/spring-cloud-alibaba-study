package com.itbin.study.demostudy.threadcallable;

import java.util.concurrent.Callable;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/12/16 17:50
 * @description:
 * @modified By:
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("表白：" + i);
        }
        return "成功";
    }
}
