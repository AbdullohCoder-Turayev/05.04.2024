package com.example.demo.Entity;

public class Customer {
    String num, name;
    long id;

    public Customer(){ }

    public Customer(String num, String name, int id){
        this.num = num;
        this.name = name;
        this.id = id;
    }


    public String getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }
}
