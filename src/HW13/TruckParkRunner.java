package HW13;

import HW13.Implement.Vehicle;
import HW13.Storage.CarStorage;
import HW13.Storage.impl.FileCarsStorage;

import java.util.Arrays;

public class TruckParkRunner {
    public static void main(String[] args) {

        CarStorage storage = new FileCarsStorage("input.txt", "output.txt");

        Vehicle[] cars = storage.readCars();
        System.out.println(Arrays.toString(cars));
        storage.writeCars(cars);

    }

}

