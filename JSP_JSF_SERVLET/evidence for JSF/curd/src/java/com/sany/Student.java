package com.sany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String round;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(String name, String round) {
        this.name = name;
        this.round = round;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRound() {
        return round;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRound(String round) {
        this.round = round;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", round=" + round + '}';
    }

}
