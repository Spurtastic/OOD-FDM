package com.fdmgroup.tdd.groupcontroller;

import java.util.ArrayList;
import java.util.Map;

public class ClassOfTrainees {


    private ArrayList<Trainee> trainees = new ArrayList<Trainee>();

    private GroupControllerService groupControllerService;

    private DatabaseReader databaseReader;

    private DatabaseWriter databaseWriter;

    public ClassOfTrainees(){

    }


    public void removeTraineeByUserName(String traineeUsername) {
        databaseWriter.deleteTraineeByUsername(traineeUsername);
    }

    public void addTrainee(Trainee trainee) {
        databaseWriter.addTrainee(trainee);
    }

    public Map<String, Trainee> getAllTrainees() {
        return databaseReader.readGroup();
    }

    public void setGroupControllerService(GroupControllerService groupControllerService) {
        this.groupControllerService = groupControllerService;
    }

    public void setDatabaseReader(DatabaseReader databaseReader) {
        this.databaseReader = databaseReader;
    }

    public void setDatabaseWriter(DatabaseWriter databaseWriter) {
        this.databaseWriter = databaseWriter;
    }


    public void removeTraineeByUsername(String number) {
        groupControllerService.removeTraineeByUsername(number);
    }
}
