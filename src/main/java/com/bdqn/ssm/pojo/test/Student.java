package com.bdqn.ssm.pojo.test;
/**
 * @ClassName: Student
 * @Description: 测试学生实体
 * @Author: xyf
 * @Date 2019/7/17 14:44
 */
public class Student {

    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
