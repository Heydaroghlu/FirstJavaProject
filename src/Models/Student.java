package Models;

public class Student {
    private String Name;
    private String SurName;
    private   int Age;
    private String ClassName;


    public Student()
    {

    }
    public Student(String name, String surName, int age, String className) {
        Name = name;
        SurName = surName;
        Age = age;
        ClassName = className;
    }

    public String getName() {
        return Name;
    }

    public String getSurName() {
        return SurName;
    }

    public int getAge() {
        return Age;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setClassName(String className) {
        ClassName = className;
    }
}
