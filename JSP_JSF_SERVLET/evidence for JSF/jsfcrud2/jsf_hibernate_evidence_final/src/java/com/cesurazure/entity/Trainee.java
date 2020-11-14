package com.cesurazure.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "trainee")
public class Trainee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private String gender;
    private String round;
    private String completedCourse;
    private String remark;

    public Trainee() {
    }

    public Trainee(String name, String email, String gender, String round, String completedCourse, String remark) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.round = round;
        this.completedCourse = completedCourse;
        this.remark = remark;
    }

    public Trainee(Integer id) {
        this.id = id;
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

    public String getCompletedCourse() {
        return completedCourse;
    }

    public void setCompletedCourse(String completedCourse) {
        this.completedCourse = completedCourse;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Trainee{" + "id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", round=" + round + ", completedCourse=" + completedCourse + ", remark=" + remark + '}';
    }

}
