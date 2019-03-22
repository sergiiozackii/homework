package _09a;

public class CarProcessor {
    Car[] arrayOfCars;

    public CarProcessor(Car[] listOfCars) {
        this.arrayOfCars = listOfCars;
    }

    public CarProcessor() {
        this.arrayOfCars = null;
    }

    public void findMark(Car[] listOfCars, String markToFind) {
        System.out.println("List of cars by mark " + markToFind + ":");

        for (int i = 0; i < listOfCars.length; i++) {
            if (listOfCars[i].mark.equals(markToFind)) {
                printCar(listOfCars[i]);
            }
        }
    }

    public void findMark(String markToFind) {
        if (arrayOfCars != null) {
            findMark(this.arrayOfCars, markToFind);
        }
    }

    public void findCarsByModelWhichMoreThanYears(Car[] listOfCars, String model, int years) {
        System.out.println("List of cars which more than " + years + " years:");

        for (int i = 0; i < listOfCars.length; i++) {
            if (listOfCars[i].model.equals(model) & listOfCars[i].workingYears() > years) {
                printCar(listOfCars[i]);
            }
        }
    }

    public void findCarsByModelWhichMoreThanYears(String model, int years) {
        if (arrayOfCars != null) {
            findCarsByModelWhichMoreThanYears(this.arrayOfCars, model, years);
        }
    }

    public void findCarsByYearAndPrice(Car[] listOfCars, int year, int price) {
        System.out.println("List of cars " + year + " year and price more than " + price);

        for (int i = 0; i < listOfCars.length; i++) {
            if (listOfCars[i].productionYear == year & listOfCars[i].price > price) {
                printCar(listOfCars[i]);
            }
        }
    }

    public void findCarsByYearAndPrice(int year, int price) {
        if (arrayOfCars != null) {
            findCarsByYearAndPrice(this.arrayOfCars, year, price);
        }
    }

    public static void printCar(Car car) {
        System.out.print("id: " + car.id + "; mark: " + car.mark + "; model: " + car.model + "; year: " + car.productionYear);
        System.out.print("; color: " + car.color + "; price: " + car.price + "; register number: " + car.registrationNumber);
    }
}