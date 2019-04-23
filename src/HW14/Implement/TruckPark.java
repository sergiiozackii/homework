package HW14.Implement;

import HW14.Interface.InterfaceTruckPark;
import HW14.Trucks.Truck;

import java.util.LinkedList;
import java.util.List;

public class TruckPark implements InterfaceTruckPark {
    private List<Truck> trucks;

    public TruckPark(List<Truck> trucks) {
        this.trucks = trucks;
    }

    public int costOfCars() {
        int cost = 0;

        for (Truck truck : trucks) {
            cost += truck.getPrice();
        }
        return cost;
    }

    public void sortByConsumption() {

        for (int i =0;i< trucks.size();i++) {
            for (int j = 0; j < i; j++) {
                if (trucks.get(j).getConsumption() < trucks.get(i).getConsumption()) {

                    Truck temp = trucks.get(j);
                    trucks.set(j,trucks.get(i));
                    trucks.set(j,temp);
                }
            }
        }
    }

    public List<Truck> findTrucksBySpeed(int minSpeed, int maxSpeed)  {
//        if (minSpeed < 0 || maxSpeed < 0)
//            throw new SearchTruckForSpeedException(minSpeed, maxSpeed);
        List<Truck> trucksBySpeed = new LinkedList<>();

        for (Truck truck : trucks) {
            if (truck.getMaxSpeed() <= maxSpeed & truck.getMaxSpeed() >= minSpeed) {
                trucksBySpeed.add(truck);
//                if (trucksBySpeed == null) {
//                    trucksBySpeed = new List<Truck>;
//                    trucksBySpeed[0] = truck;
//                } else {
//                    List<Truck> tempCars = new Truck()[trucksBySpeed.size() + 1];
//
//                    for (int i = 0; i < trucksBySpeed.size(); i++) {
//                        tempCars[i] = trucksBySpeed[i];
//                    }
//                    tempCars[tempCars.size() - 1] = truck;
//                    trucksBySpeed = tempCars;
                }
            }

        return trucksBySpeed;
    }


    public String toString() {
        int i;
        String result = "";
        for (i = 0; i < trucks.size(); i++) {
            result += trucks.toString() + "\n";
        }
        return result;
    }
}