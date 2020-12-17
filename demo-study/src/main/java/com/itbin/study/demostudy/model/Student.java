package com.itbin.study.demostudy.model;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/11/30 20:34
 * @description:
 * @modified By:
 */
public class Student implements Comparable<Student> {

    private String name;

    private Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int result = this.age - o.age;
        return result;
    }
}
