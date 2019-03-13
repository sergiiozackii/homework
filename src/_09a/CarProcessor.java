package _09;

public class CarProcessor {

    Car[] arrayOfCars;

    CarProcessor(Car[] arrayOfCars) {
        this.arrayOfCars = arrayOfCars;
    }

    CarProcessor() {

    }

    public void findCarsByMark(Car[] cars, String mark) {
        System.out.println("\nCarsByMark => " + mark);

        for (Car car : cars) {
            if (car.mark.equals(mark)) {
                printCar(car);
            }
        }
    }

    public void findCarsByMark(String mark) {
        System.out.println("\nCarsByMark => " + mark);
        for (Car car : cars) {
            if (arrayOfCars[i] == null) {
                return;
            }
            if (car.mark.equals(mark)) {
                printCar(car);
            }


            public void findCarsByModelWhichMoreThanYears (Car[]cars, String model,int year){
                System.out.println("\nCarsByModelWhichMoreThanYears =>" + model);

                for (Car car : cars) {
                    if (car.model.equals(model) && car.workingYears() > 5) {
                        printCar(car);

                    }
                }
            }

            public void findCarsByModelWhichMoreThanYears (String model,int year){
                System.out.println("\nCarsByModelWhichMoreThanYears =>" + model);

                for (Car car : cars) {
                    if (arrayOfCars[i] == null) {
                        return;

                    }
                    if (car.model.equals(model) && car.workingYears() > 5) {
                        printCar(car);
                    }
                }
            }


            public void printCar (Car car){
                System.out.println("Car [id = " + car.id + ", mark =" + car.mark + ", model = " + car.model + ", productionYear = " + car.productionYear + ", color = " + car.color + ", price = " + car.price + ", registrationNumber = " + car.registrationNumber);
            }
        }