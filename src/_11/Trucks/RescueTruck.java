package _11.Trucks;

public class RescueTruck extends Truck {
    int waterPump;

    public RescueTruck(String typeOfTruck, String brand, String model, int price, double consumption, int maxSpeed, int tankCapacity, int waterPump) {
        super(typeOfTruck, brand, model, price, consumption, maxSpeed, tankCapacity);
        this.waterPump = waterPump;
    }

    public String toString() {
        return "RescueTruck [" + super.toString() + ";waterPump:" + waterPump + "]";
    }
}


