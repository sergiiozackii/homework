package HW14.Storage;

import HW14.Trucks.Truck;

import java.util.List;

public interface CarStorage {

    List<Truck> readCars();

    void writeCars(List<Truck> cars);
}
