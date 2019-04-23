package HW14.Interface;

import HW14.Exception.SearchTruckForSpeedException;
import HW14.Trucks.Truck;

import java.util.List;

public interface InterfaceTruckPark {
    int costOfCars();

    void sortByConsumption();

    List<Truck> findTrucksBySpeed(int minSpeed, int maxSpeed) throws SearchTruckForSpeedException;
}
