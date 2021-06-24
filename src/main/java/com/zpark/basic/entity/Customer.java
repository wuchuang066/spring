package com.zpark.basic.entity;

import org.springframework.beans.factory.InitializingBean;

import java.io.Serializable;
import java.util.*;

public class Customer implements Serializable, InitializingBean {
    private String name;
    private int age;
    private String[] emails;
    private Set<String> tels;
    private List<String> address;
    private Map<String,String> qqs;
    private Properties p;
    private Date birth;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    private void abc(){
//        setAge(11);
        System.out.println(this.age+"我是调用initmethod执行的方法");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", emails=" + Arrays.toString(emails) +
                ", tels=" + tels +
                ", address=" + address +
                ", qqs=" + qqs +
                ", p=" + p +
                ", birth=" + birth +
                '}';
    }

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

    public String[] getEmails() {
        return emails;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    public Set<String> getTels() {
        return tels;
    }

    public void setTels(Set<String> tels) {
        this.tels = tels;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public Map<String, String> getQqs() {
        return qqs;
    }

    public void setQqs(Map<String, String> qqs) {
        this.qqs = qqs;
    }

    public Properties getP() {
        return p;
    }

    public void setP(Properties p) {
        this.p = p;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getAge());
        this.setName("吴哈哈");
        System.out.println("我是执行afterPropertiesSet");
    }
}
