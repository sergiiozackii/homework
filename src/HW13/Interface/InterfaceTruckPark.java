package HW13.Interface;

import HW13.Exception.SearchTruckForSpeedException;
import HW13.Implement.Vehicle;

public interface InterfaceTruckPark {
    int costOfCars();

    void sortByConsumption();

    Vehicle[] findTrucksBySpeed(int minSpeed, int maxSpeed) throws SearchTruckForSpeedException;
}
