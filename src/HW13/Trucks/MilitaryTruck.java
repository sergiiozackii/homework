package HW13.Trucks;

public class MilitaryTruck extends Truck {
    int ammunition;

    public MilitaryTruck(int price, int consumption, int maxSpeed, int tankCapacity) {
        super(price, consumption, maxSpeed, tankCapacity);
        this.ammunition = ammunition;
    }

    @Override
    public String toString() {
        return "MilitaryTruck{" +
                "ammunition=" + ammunition +
                '}';
    }

    public MilitaryTruck(String[] carProperties) {
        this(Integer.parseInt(carProperties[1]), Integer.parseInt(carProperties[2]), Integer.parseInt(carProperties[3]), Integer.parseInt(carProperties[4]));


    }
}




