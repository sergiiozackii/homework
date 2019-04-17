package HW13.Trucks;

public class ConstructionTruck extends Truck {
    int loadCapacity;

    public ConstructionTruck(int price, int consumption, int maxSpeed, int loadCapacity) {
        super(price, consumption, maxSpeed, loadCapacity);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "ConstructionTruck{" +
                "loadCapacity=" + loadCapacity +
                '}';
    }

    public ConstructionTruck(String[] carProperties) {
        this(Integer.parseInt(carProperties[1]), Integer.parseInt(carProperties[2]), Integer.parseInt(carProperties[3]), Integer.parseInt(carProperties[4]));


    }

    public String toFileFormat() {
        return "ConstructionTruck," + getPrice() + "," + getConsumption() + "," + getMaxSpeed();
    }
}

