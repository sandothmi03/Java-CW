package com.example.javafxcw2;

import javafx.scene.image.Image;

public class HorseData {

    private Integer horseID;
    private String horseName;
    private String jockeyName;
    private Integer horseAge;
    private String horseBreed;
    private Integer raceRecord;
    private String group;
    private Image horsePicture;



    public HorseData(Integer horseID, String horseName, String jockeyName, Integer horseAge, String horseBreed, Integer raceRecord, String group, Image horsePicture) {
        this.horseID = horseID;
        this.horseName = horseName;
        this.jockeyName = jockeyName;
        this.horseAge = horseAge;
        this.horseBreed = horseBreed;
        this.raceRecord = raceRecord;
        this.group = group;
        this.horsePicture = horsePicture;
    }

    public Integer getHorseID() {
        return horseID;
    }

    public void setHorseID(Integer horseID) { this.horseID = horseID; }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    public String getJockeyName() {
        return jockeyName;
    }

    public void setJockeyName(String jockeyName) {
        this.jockeyName = jockeyName;
    }

    public Integer getHorseAge() {
        return horseAge;
    }

    public void setHorseAge(Integer horseAge) { this.horseAge = horseAge; }

    public String getHorseBreed() { return horseBreed; }

    public void setHorseBreed(String horseBreed) {
        this.horseBreed = horseBreed;
    }

    public Integer getRaceRecord() {
        return raceRecord;
    }

    public void setRaceRecord(Integer raceRecord) {
        this.raceRecord = raceRecord;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Image getHorsePicture(){
        return horsePicture;
    }

    public void setHorsePicture(Image horsePicture){
        this.horsePicture = horsePicture;
    }
}

