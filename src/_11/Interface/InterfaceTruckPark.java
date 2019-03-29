package _11.Interface;

import _11.Implement.Vehicle;

public interface InterfaceTruckPark {
    int costOfCars();

    void sortByConsumption();

    Vehicle[] findTrucksBySpeed(int minSpeed, int maxSpeed);
}
