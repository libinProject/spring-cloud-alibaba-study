package com.itbin.study.demostudy;

import com.itbin.study.demostudy.model.Student;

import java.util.*;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/11/30 20:35
 * @description:
 * @modified By:
 */
public class MyTreeSetDemoApp {

    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("小明", 15);
        Student s2 = new Student("小小明", 19);
        Student s3 = new Student("小明名", 13);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        System.out.println(ts);

        HashMap<String, String> hm = new HashMap<>();
        hm.put("001", "value001");
        hm.put("002", "value002");
        hm.put("003", "value003");
        hm.put("004", "value004");
        hm.put("005", "value005");

        Set<String> set = hm.keySet();
        System.out.println(set);

        for (String s : set) {
            System.out.println("key:" + s + "value:" + hm.get(s));
        }

        Set<Map.Entry<String, String>> entries = hm.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "--------" + entry.getValue());
        }

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add("ddd");
        arrayList.add("fff");

        arrayList.stream().limit(3).forEach(s -> System.out.println(s));
        arrayList.stream().skip(3).forEach(s -> System.out.println(s));
    }
}
