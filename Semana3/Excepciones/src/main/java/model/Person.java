package model;

public class Person {
    private String name;
    private String cc;
    private int age;

    public Person(String name, String cc, int age) {
        this.name = name;
        this.cc = cc;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
