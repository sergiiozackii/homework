package _09;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = {new Car(1, "BMW", "M5", 2005, "Black", 8000, 7777),
                new Car(2, "Merсedes", "Vito", 2010, "White", 10000, 5555),
                new Car(3, "Fiat", "Doblo", 2007, "blue", 5000, 4871),
                new Car(4, "Opel", "Astra", 2001, "Red", 1500, 5235)};

        CarProcessor processor = new CarProcessor();

        processor.findCarsByMark(cars,"BMW");
        processor.findCarsByModelWhichMoreThanYears(cars,"Astra", 5);
        processor.findCarsByProductionYearWithMorePrice(cars, 2007 , 3000);
    }
}

