package HW14.Storage.impl;

import HW14.Storage.CarStorage;
import HW14.Trucks.ConstructionTruck;
import HW14.Trucks.MilitaryTruck;
import HW14.Trucks.Truck;


import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
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

    public List<Truck> readCars() {

        try (FileInputStream fis = new FileInputStream(inputFileName)) {
            String fileString = CreateString(fis);
            String[] carString = fileString.split(";" + System.lineSeparator());
            List<Truck> trucks = new LinkedList<Truck>();

            for (int i = 0; i < carString.length; i++) {
                String[] carProperties = carString[i].split(",");
                switch (carProperties[0]) {
                    case "ConstructionTruck":
                        trucks.add(new ConstructionTruck(carProperties));
                        break;
                    case "MilitaryTruck":
                        trucks.add(new MilitaryTruck(carProperties));
                        break;
                    case "Truck":
                        trucks.add(new Truck(carProperties));
                        break;

                }
            }
            return trucks;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public String CreateString(FileInputStream fis) throws IOException {
        byte[] fileBytes = new byte[fis.available()];
        fis.read(fileBytes);
        return new String(fileBytes);
    }


    public void writeCars(List<Truck> trucks) {
        try (FileOutputStream writer = new FileOutputStream(outputFileName)) {
            StringJoiner sj = new StringJoiner(";" + System.lineSeparator());
            for (Truck truck: trucks) {
                sj.add(truck.toString());
            }
            writer.write(sj.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}