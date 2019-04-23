package HW14.Interface;

public interface InterfaceVechicle {
    int getPrice();

    void setPrice(int price);

    int getMaxSpeed();

    void setMaxSpeed(int maxSpeed);

    int getConsumption();

    void setConsumption(int consumption);

    default String toFileFormat() {
        return "";
    }
}
