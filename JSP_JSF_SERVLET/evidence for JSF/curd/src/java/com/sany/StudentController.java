package com.sany;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
//Evidence Test

@ManagedBean
@RequestScoped
public class StudentController {

    private Student student;
    private String result;
    StudentService service = new StudentService();
    private List<Student> students;

    public void saveStudent() {
        service.save(student);
        result = "Insert Success";

    }

    public void updateStudent() {
        service.update(student);
        result = "Update Success";
        System.out.println("............Success.........");
    }

    public void displayUpdate(int id) {
        student = service.getById(id);
    }

    public void deleteStudent(int id) {
        service.delete(new Student(id));
        result = "Delete Success";
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

}
