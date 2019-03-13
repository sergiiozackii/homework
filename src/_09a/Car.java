package _09;

class Car {

    int id;
    String mark;
    String model;
    int productionYear;
    String color;
    int price;
    int registrationNumber;

    Car(int id, String mark, String model, int productionYear, String color, int price, int registrationNumber) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    int workingYears() {
        return 2019 - productionYear;
    }
}
