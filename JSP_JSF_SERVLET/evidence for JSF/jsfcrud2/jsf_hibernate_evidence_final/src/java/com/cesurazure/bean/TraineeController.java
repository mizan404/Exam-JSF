package com.cesurazure.bean;

import com.cesurazure.entity.Trainee;
import com.cesurazure.service.TraineeService;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class TraineeController {

    private Trainee trainee;
    private String result;
    TraineeService service = new TraineeService();
    private List<Trainee> trainees;
    private String[] completedCourses;

    public void savetrainee() {
		//...................................................
        String cc = "";
        for (String s : completedCourses) {
            cc += s + ",";
        }
        trainee.setCompletedCourse(cc);
        service.save(trainee);
        result = "Inserted Successfully";
    }

    public void updateTrainee() {
		//.................................................
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < completedCourses.length; i++) {
            sb.append(completedCourses[i] + " ");
        }
        trainee.setCompletedCourse(sb.toString());
        service.update(trainee);
        result = "Updated Successfully";
    }

    public void deleteTrainee(int id) {
        service.delete(new Trainee(id));
        result = "Deleted Successfully";
    }

    public void displayUpdate(int id) {
        trainee = service.getById(id);
    }

    public Trainee getTrainee() {
        //..................................................................
        if (trainee == null) {
            trainee = new Trainee();
        }
        return trainee;
    }

    public void setTrainee(Trainee trainee) {
        this.trainee = trainee;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public TraineeService getService() {
        return service;
    }

    public void setService(TraineeService service) {
        this.service = service;
    }

    public List<Trainee> getTrainees() {
        //.......................................................
        trainees = service.getAll();
        return trainees;
    }

    public void setTrainees(List<Trainee> trainees) {
        this.trainees = trainees;
    }

    public String[] getCompletedCourses() {
        return completedCourses;
    }

    public void setCompletedCourses(String[] completedCourses) {
        this.completedCourses = completedCourses;
    }

}
