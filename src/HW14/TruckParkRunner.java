package HW14;

import HW14.Implement.TruckPark;
import HW14.Storage.CarStorage;
import HW14.Storage.impl.FileCarsStorage;
import HW14.Trucks.Truck;

import java.util.List;

public class TruckParkRunner {
    public static void main(String[] args) {

        CarStorage storage = new FileCarsStorage("input.txt", "output.txt");

        List<Truck> trucks = storage.readCars();

        TruckPark tp= new TruckPark(trucks);
        tp.sortByConsumption();
        System.out.println(trucks);

        System.out.println(tp.findTrucksBySpeed(150,180));

        storage.writeCars(trucks);

    }

}

