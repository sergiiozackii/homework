package HW13.Trucks;

import HW13.Implement.Vehicle;

public class Truck extends Vehicle {
    private int tankCapacity;

    public Truck(int price, int consumption, int maxSpeed, int tankCapacity) {
        super(price, consumption, maxSpeed);
        this.tankCapacity = tankCapacity;
    }

    public Truck(String[] carProperties) {
        this(Integer.parseInt(carProperties[1]), Integer.parseInt(carProperties[2]), Integer.parseInt(carProperties[3]), Integer.parseInt(carProperties[4]));

    }

    public String toFileFormat() {
        return "Truck," + getPrice() + "," + getConsumption() + "," + getMaxSpeed();
    }
}

