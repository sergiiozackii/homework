package _09;

public class CarProcessor {

    public void findCarsByMark(Car[] cars, String mark) {
        System.out.println("\nCarsByMark => " + mark);

        for (Car car : cars) {
            if (car.mark.equals(mark)) {
                printCar(car);
            }
        }
    }

    public void findCarsByModelWhichMoreThanYears(Car[] cars, String model, int years) {
        System.out.println("\nCarsByModelWhichMoreThanYears =>" + model);

        for (Car car : cars) {
            if (car.model.equals(model) && car.workingYears() > years) {
                printCar(car);

            }
        }
    }

    public void findCarsByProductionYearWithMorePrice(Car[] cars, int productionYear, int price) {
        System.out.println("\nCarsByProductionYearWithMorePrice =>" + productionYear);

        for (Car car : cars) {
            if (car.productionYear == productionYear && car.price > price) {
                printCar(car);
            }
        }
    }
    public void printCar(Car car) {
        System.out.println("Car [id = " + car.id + ", mark =" + car.mark + ", model = " + car.model + ", productionYear = " + car.productionYear + ", color = " + car.color + ", price = " + car.price + ", registrationNumber = " + car.registrationNumber);
    }
}
