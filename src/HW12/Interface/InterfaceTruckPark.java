package HW12.Interface;

import HW12.Exception.SearchTruckForSpeedException;
import HW12.Implement.Vehicle;

public interface InterfaceTruckPark {
    int costOfCars();

    void sortByConsumption();

    Vehicle[] findTrucksBySpeed(int minSpeed, int maxSpeed) throws SearchTruckForSpeedException;
}
