package com.example.recyclerfragchallenge;

public class Car {

    private String carMake, carModel, carOwner, carOwnerCont;

    public Car(String carMake, String carModel, String carOwner, String carOwnerCont) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.carOwner = carOwner;
        this.carOwnerCont = carOwnerCont;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public String getCarOwnerCont() {
        return carOwnerCont;
    }

    public void setCarOwnerCont(String carOwnerCont) {
        this.carOwnerCont = carOwnerCont;
    }
}
