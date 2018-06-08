package com.feng.trace1.pojo;

/**
 * user demo
 * @author: PMTY
 * @create: 2018-05-28 14:20
 **/
public class UserDemo {

    private String name;
    private String age;

    public UserDemo(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public UserDemo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDemo{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}