package _11.Trucks;

public class MilitaryTruck extends Truck {
    int ammunition;

    public MilitaryTruck(String typeOfTruck, String brand, String model, int price, double consumption, int maxSpeed, int tankCapacity, int ammunition) {
        super(typeOfTruck, brand, model, price, consumption, maxSpeed, tankCapacity);
        this.ammunition = ammunition;
    }

    public String toString() {
        return "MilitaryTruck[" + super.toString() + ";ammunition:" + ammunition + "]";
    }
}




