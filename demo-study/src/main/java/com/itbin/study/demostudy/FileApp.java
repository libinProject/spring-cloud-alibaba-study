package com.itbin.study.demostudy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/12/8 16:59
 * @description:
 * @modified By:
 */
public class FileApp {

    public static void main(String[] args) throws IOException {
        System.out.println("请输入用户名：");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();

        FileWriter fw = new FileWriter("D:\\aaa.txt");
        fw.write(userName);
        fw.write("\n");
        fw.write(password);
        fw.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\aaa.txt"));


    }
}
