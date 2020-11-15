/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizanthecoder;

import com.sun.faces.action.RequestMapping;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author mohdm
 */
@ManagedBean
@RequestMapping
public class Controller {

    private Student student;
    private String result;
    Service service = new Service();
    private List<Student> students;
    private String[] education;

    public void save() {
        String edu = "";
        for (String s : education) {
            edu += s + ",";
        }
        student.setEducation(edu);
        service.saveStudent(student);
        result = "Inserted.........";
    }

    public void update() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < education.length; i++) {
            sb.append(education[i] + " ");
        }
        student.setEducation(sb.toString());
        service.updateStudent(student);
        result = "Updated.........";
    }

    public void delete(int id) {
        service.deleteStudent(new Student(id));
        result = "delete.........";
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

    public String[] getEducation() {
        return education;
    }

    public void setEducation(String[] education) {
        this.education = education;
    }

}
