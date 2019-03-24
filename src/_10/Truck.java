package _10;

abstract class Truck extends Vehicle {
    private int tankCapacity;

    public Truck(String typeOfTruck, String brand, String model, int price, double consumption, int maxSpeed, int tankCapacity) {
        super(typeOfTruck, brand, model, price, consumption, maxSpeed);
        this.tankCapacity = tankCapacity;
    }

    public String toString() {
        return super.toString() + ";tankCapasity:" + tankCapacity;
    }
}

