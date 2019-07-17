package com.bdqn.ssm.pojo.test;
/**
 * @Description: 测试实体类
 * @param:
 * @return:
 * @Date: 2019/07/17 14:34
 */
public class Admin {
    private String name;
    private int age;

    private Address1 address1;//地址

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address1 getAddress1() {
        return address1;
    }

    public void setAddress1(Address1 address1) {
        this.address1 = address1;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address1=" + address1 +
                '}';
    }
}
