package _10;

public class TruckPark {
    private Vehicle[] truckPark;

    TruckPark(Vehicle[] truckPark) {
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

    Vehicle[] findTrucksBySpeed(int minSpeed, int maxSpeed) {
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