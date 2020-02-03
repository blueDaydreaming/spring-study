package com.blue.pojo;

public class User {
    private String name;
    int x=0;

    public User(String name){

        x++;

        this.name = name;
        System.out.println("创建了有参数对象"+x);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name="+name);
    }
}
