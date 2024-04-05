public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private double headroom;
    private String transmission;
    private Person driver;

    public Car(String make, String model, int year, String color, double headroom, String transmission, Person driver) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.headroom = headroom;
        this.transmission = transmission;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{make='" + make + "', model='" + model + "', year=" + year + ", color='" + color + "', headroom=" + headroom + ", transmission='" + transmission + "', driver=" + driver + '}';
    }

    public boolean isDriverTooTall() {
        return driver.isTooTallForCar(headroom);
    }

    public boolean isDriverUnableToDriveManual() {
        return "manual".equalsIgnoreCase(transmission) && !driver.canDriveManual();
    }
}
