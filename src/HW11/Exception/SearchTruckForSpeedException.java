package HW11.Exception;

public class SearchTruckForSpeedException extends Exception {
    private int min;
    private int max;

    public SearchTruckForSpeedException(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public String toString() {
        return "SearchTruckForSpeedException{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}
