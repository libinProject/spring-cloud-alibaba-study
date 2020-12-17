package com.itbin.study.dubboconsumer;

import java.util.*;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/11/25 10:44
 * @description:
 * @modified By:
 */
public class TestApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("add");
        collection.add("bbb");
        collection.add("dddd");
//        System.out.println(collection);
//
//        collection.removeIf((String s) -> {
//            return s.length() == 3;
//        });
//
//        System.out.println(collection);

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            if ("bbb".equals(str)){
                collection.remove(str);
            }
            System.out.println(str);
        }

        List<String> arrayList = new LinkedList<>();

        System.out.println("-----set demo--------------");
        Set<String> set = new TreeSet<>();
        set.add("aaa");
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("-------------------");

        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
