package model;

public class Person {
    private String name;
    private int age;
    private String cc;

    public Person(String name, int age, String cc) {
        this.name = name;
        this.age = age;
        this.cc = cc;
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

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
}
