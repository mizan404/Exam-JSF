/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizanthecoder;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author mohdm
 */
@ManagedBean
@RequestScoped
public class Controller {

    private Student student;

    private String result;

    Service service = new Service();

    private List<Student> students;
    private String[] course;

    public Controller() {
    }

    public void save() {
        String cs = "";
        for (String s : course) {
            cs += s + ", ";
        }
        student.setCourse(cs);
        service.saveStudent(student);
        result = "Inserted.........";

    }

    public void update() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < course.length; i++) {
            sb.append(course[i] + ", ");

        }
        student.setCourse(sb.toString());
        service.updateStudent(student);
        result = "Update.........";

    }

    public void delete(int id) {
        service.deleteStudent(new Student(id));
        result = "Delete.........";

    }

    public void displayUpdate(int id) {
        student = service.getById(id);

    }

    public Student getStudent() {
        if (student == null) {
            student = new Student();

        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public List<Student> getStudents() {
        students = service.getAll();
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String[] getCourse() {
        return course;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

}
