package com.mks.result.entity;

import jakarta.persistence.*;

@Entity
//@Table(uniqueConstraints={@UniqueConstraint(columnNames={"usn"})})

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
    @Column(unique=true)
    private String usn;
   private String name;
   private String java;
   private String python;
   private String c;

    public Student() {
    }

    public Student(int id, String usn, String name, String java, String python, String c) {
        this.id = id;
        this.usn = usn;
        this.name = name;
        this.java = java;
        this.python = python;
        this.c = c;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJava() {
        return java;
    }

    public void setJava(String java) {
        this.java = java;
    }

    public String getPython() {
        return python;
    }

    public void setPython(String python) {
        this.python = python;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
