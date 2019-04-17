package HW13.Storage;

import HW13.Implement.Vehicle;

public interface CarStorage {

    Vehicle[] readCars();

    void writeCars(Vehicle[] cars);
}
