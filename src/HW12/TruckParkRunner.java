package HW12;

import HW12.Exception.SearchTruckForSpeedException;
import HW12.Implement.TruckPark;
import HW12.Implement.Vehicle;
import HW12.Trucks.ConstructionTruck;
import HW12.Trucks.MilitaryTruck;
import HW12.Trucks.RescueTruck;

public class TruckParkRunner {
    public static void main(String[] args) {
        Vehicle[] listOfCars = new Vehicle[]{
                new RescueTruck("rescue", "MAN", "TGX", 95000, 20, 130, 700, 150),
                new RescueTruck("rescue", "RENO", "T290", 70000, 18, 150, 600, 180),
                new MilitaryTruck("military", "MERCEDES", "ACTROS", 200000, 30, 180, 600, 420),
                new MilitaryTruck("military", "SKODA", "A800", 120000, 22, 180, 430, 320),
                new ConstructionTruck("construction", "SCANIA", "S730", 170000, 45, 120, 480, 2200),
                new ConstructionTruck("comstruction", "KAMAZ", "5490NEO", 30000, 28, 90, 520, 1700)};


        TruckPark truckPark = new TruckPark(listOfCars);
        System.out.println("The cost of Truckpark is: " + truckPark.costOfCars() + " euro");
        System.out.println();
        System.out.println("Truck sorted by consumption:");
        truckPark.sortByConsumption();
        System.out.println(truckPark.toString());
        System.out.println("Truck find by speed:");
        try {
            Vehicle[] trucksBySpeed = truckPark.findTrucksBySpeed(0, -2);
            for (Vehicle vehicle : trucksBySpeed) {
                System.out.println(vehicle.toString());
            }
        } catch (SearchTruckForSpeedException e) {
            System.out.println("Catch:" + e);

        }

    }
}
