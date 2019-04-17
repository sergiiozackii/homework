package HW13.Implement;

import HW13.Interface.InterfaceVechicle;


public abstract class Vehicle implements InterfaceVechicle {
    private int price;
    private int consumption;
    private int maxSpeed;


    public Vehicle(int price, int consumption, int maxSpeed) {
        this.price = price;
        this.consumption = consumption;
        this.maxSpeed = maxSpeed;
    }


    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                ", consumption=" + consumption +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}