package HW11.Implement;

import HW11.Exception.SearchTruckForSpeedException;
import HW11.Interface.InterfaceTruckPark;

public class TruckPark implements InterfaceTruckPark {
    public Vehicle[] truckPark;

    public TruckPark(Vehicle[] truckPark) {
        this.truckPark = truckPark;
    }

    public int costOfCars() {
        int truckParkCost = 0;

        for (Vehicle vehicle : truckPark) {
            truckParkCost += vehicle.getPrice();
        }
        return truckParkCost;
    }

    public void sortByConsumption() {

        for (int i = truckPark.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (truckPark[j].getConsumption() > truckPark[j + 1].getConsumption()) {

                    Vehicle temp = truckPark[j];
                    truckPark[j] = truckPark[j + 1];
                    truckPark[j + 1] = temp;
                }
            }
        }
    }

    public Vehicle[] findTrucksBySpeed(int minSpeed, int maxSpeed) throws SearchTruckForSpeedException {
        if (minSpeed < 0 || maxSpeed < 0)
            throw new SearchTruckForSpeedException(minSpeed, maxSpeed);
        Vehicle[] trucksBySpeed = {};

        for (Vehicle vehicle : truckPark) {
            if (vehicle.getMaxSpeed() <= maxSpeed & vehicle.getMaxSpeed() >= minSpeed) {
                if (trucksBySpeed == null) {
                    trucksBySpeed = new Vehicle[1];
                    trucksBySpeed[0] = vehicle;
                } else {
                    Vehicle[] tempCars = new Vehicle[trucksBySpeed.length + 1];

                    for (int i = 0; i < trucksBySpeed.length; i++) {
                        tempCars[i] = trucksBySpeed[i];
                    }
                    tempCars[tempCars.length - 1] = vehicle;
                    trucksBySpeed = tempCars;
                }
            }
        }
        return trucksBySpeed;
    }


    public String toString() {
        int i;
        String result = "";
        for (i = 0; i < truckPark.length; i++) {
            result += truckPark[i].toString() + "\n";
        }
        return result;
    }
}