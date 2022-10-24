package com.manulife.bigdata.fundamental;

public class Test01_DynamicBind {
    public static void main(String[] args) {
        Person1 student = new Student1();
        System.out.println(student.name);
        student.hello();
    }
}

class Person1 {
    String name = "Person";
    public void hello() {
        System.out.println("Person Hello");
    }
}

class Student1 extends Person1 {
    String name = "Student";
    public void hello() {
        System.out.println("Student Hello");
    }
}