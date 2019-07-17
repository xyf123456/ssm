package com.bdqn.ssm.pojo.test;

public class Address1 {
    private int id;
    private String addName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddName() {
        return addName;
    }

    public void setAddName(String addName) {
        this.addName = addName;
    }


    @Override
    public String toString() {
        return "Address1{" +
                "id=" + id +
                ", addName='" + addName + '\'' +
                '}';
    }
}
