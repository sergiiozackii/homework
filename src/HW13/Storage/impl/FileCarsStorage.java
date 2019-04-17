package HW13.Storage.impl;

import HW13.Implement.Vehicle;
import HW13.Storage.CarStorage;
import HW13.Trucks.ConstructionTruck;
import HW13.Trucks.MilitaryTruck;
import HW13.Trucks.Truck;


import java.io.*;
import java.util.StringJoiner;

public class FileCarsStorage implements CarStorage {

    private String inputFileName;
    private String outputFileName;

    public FileCarsStorage(String inputFileName, String outputFileName) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
    }

    public FileCarsStorage(String fileName) {
        this.inputFileName = fileName;
        this.outputFileName = fileName;
    }

    public Vehicle[] readCars() {

        try (FileInputStream fis = new FileInputStream(inputFileName)) {
            String fileString = CreateString(fis);
            String[] carString = fileString.split(";" + System.lineSeparator());
            Vehicle[] cars = new Vehicle[carString.length];

            for (int i = 0; i < carString.length; i++) {
                String[] carProperties = carString[i].split(",");
                switch (carProperties[0]) {
                    case "ConstructionTruck":
                        cars[i] = new ConstructionTruck(carProperties);
                        break;
                    case "MilitaryTruck":
                        cars[i] = new MilitaryTruck(carProperties);
                        break;
                    case "Truck":
                        cars[i] = new Truck(carProperties);
                        break;

                }
            }
            return cars;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Vehicle[0];
    }

    public String CreateString(FileInputStream fis) throws IOException {
        byte[] fileBytes = new byte[fis.available()];
        fis.read(fileBytes);
        return new String(fileBytes);
    }


    public void writeCars(Vehicle[] cars) {
        try (FileOutputStream writer = new FileOutputStream(outputFileName)) {
            StringJoiner sj = new StringJoiner(";" + System.lineSeparator());
            for (Vehicle car : cars) {
                sj.add(car.toString());
            }
            writer.write(sj.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}