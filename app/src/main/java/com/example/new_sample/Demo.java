package com.example.new_sample;

public class Demo {
    int id;
    int code;
    String name,dept;
    public Demo(){}

    public Demo(int a)
    {
        id=a;
    }

    public Demo(int id,int code,String name,String  dept)
    {
        this.id=id;
        this.code=code;
        this.name=name;
        this.dept=dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
