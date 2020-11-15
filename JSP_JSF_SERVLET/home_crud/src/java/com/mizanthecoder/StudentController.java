/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizanthecoder;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author mohdm
 */
@ManagedBean
@RequestScoped
public class StudentController {
    
    private Student student;
    private String result;
    StudentService service = new StudentService();
    private List<Student> students;
    private String[] completeCourses;
    
    public void save() {
        String cc = "";        
        for (String s : completeCourses) {
            cc += s + ",";            
        }
        student.setCompleteCourse(cc);
        service.saveStudent(student);
        result = "Data Inserted";
    }
    
    public void update() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < completeCourses.length; i++) {
            sb.append(completeCourses[i] + "");            
            
        }
        student.setCompleteCourse(sb.toString());
        service.updateStudent(student);
        result = "Data Updated";
    }
    
    public void delete(int id) {
        service.deleteStudent(new Student(id));
        result = "Data delete";
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
    
    public StudentService getService() {
        return service;
    }
    
    public void setService(StudentService service) {
        this.service = service;
    }
    
    public List<Student> getStudents() {
        students = service.getAll();
        
        return students;
    }
    
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    public String[] getCompleteCourses() {
        return completeCourses;
    }
    
    public void setCompleteCourses(String[] completeCourses) {
        this.completeCourses = completeCourses;
    }
    
}
