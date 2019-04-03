package HW11.Interface;

import HW11.Exception.SearchTruckForSpeedException;
import HW11.Implement.Vehicle;

public interface InterfaceTruckPark {
    int costOfCars();

    void sortByConsumption();

    Vehicle[] findTrucksBySpeed(int minSpeed, int maxSpeed) throws SearchTruckForSpeedException;
}
