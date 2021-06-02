package com.sogou.entity;


import org.springframework.stereotype.Component;

/**
 * @Classname Student
 */
@Component
public class Student {
    private Integer stuId;
    private Integer age;
    private String name;

    public Student() {
    }

    public Student(Integer stuId, Integer age, String name) {
        this.stuId = stuId;
        this.age = age;
        this.name = name;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("student init....");
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
