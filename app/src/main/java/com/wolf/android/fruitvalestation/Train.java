package com.wolf.android.fruitvalestation;

public class Train {
    String minutes;
    String trainColor;
    String trainPlatform;


    public Train(String minutes, String trainColor, String trainPlatform) {
        this.minutes = minutes;
        this.trainColor = trainColor;
        this.trainPlatform = trainPlatform;

    }
    public String getTrainMinutes() {
        return minutes;
    }

    public String getTrainColor() {
        return trainColor;
    }

    public String getTrainPlatform() {
        return trainPlatform;
    }

}
