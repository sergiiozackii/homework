package _10;

public class ConstructionTruck extends Truck {
    int loadCapacity;

    public ConstructionTruck(String typeOfTruck, String brand, String model, int price, double consumption, int maxSpeed, int tankCapacity, int loadCapacity) {
        super(typeOfTruck, brand, model, price, consumption, maxSpeed, tankCapacity);
        this.loadCapacity = loadCapacity;
    }

    public String toString() {
        return "ConstructionTruck[" + super.toString() + ";loadCapacity:" + loadCapacity + "]";
    }
}

