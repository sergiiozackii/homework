package HW12.Implement;

import HW12.Interface.InterfaceVechicl;

public abstract class Vehicle implements InterfaceVechicl {
    private String typeOfTruck;
    private String brand;
    private String model;
    private int price;
    private double consumption;
    private int maxSpeed;

    public Vehicle(String typeOfTruck, String brand, String model, int price, double consumption, int maxSpeed) {
        this.typeOfTruck = typeOfTruck;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.consumption = consumption;
        this.maxSpeed = maxSpeed;
    }

    public String getTypeOfTruck() {
        return typeOfTruck;
    }

    public void setTypeOfTruck(String typeOfTruck) {
        this.typeOfTruck = typeOfTruck;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "typeOfTruck='" + typeOfTruck + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", consumption=" + consumption +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}