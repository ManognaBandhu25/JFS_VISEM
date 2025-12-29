package com.skillnext1;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int sem;
    private String dept;
    private String course;
    private String email;

    // No-arg constructor (required by Hibernate)
    public Student() {}

    // Parameterized constructor
    public Student(String name, int sem, String dept, String course, String email) {
        this.name = name;
        this.sem = sem;
        this.dept = dept;
        this.course = course;
        this.email = email;
    }

    // getters & setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSem() {
        return sem;
    }
    public void setSem(int sem) {
        this.sem = sem;
    }

    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}