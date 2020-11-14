/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizanthecoder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author mohdm
 */
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private String gender;
    private String round;
    private String completeCourse;
    private String remark;

    public Student() {
    }

    public Student(Integer id) {
        this.id = id;
    }

    public Student(String name, String email, String gender, String round, String completeCourse, String remark) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.round = round;
        this.completeCourse = completeCourse;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getCompleteCourse() {
        return completeCourse;
    }

    public void setCompleteCourse(String completeCourse) {
        this.completeCourse = completeCourse;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", round=" + round + ", completeCourse=" + completeCourse + ", remark=" + remark + '}';
    }

}
