//The person class represents the individuals' information
public class Person {
    private String name;
    private int age;
    private double height;
    private boolean canDriveStick;

    public Person(String name, int age, double height, boolean canDriveStick) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.canDriveStick = canDriveStick;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", height=" + height + ", canDriveStick=" + canDriveStick + '}';
    }
//verifies if the person is too tall for the headroom avaliable
    public boolean isTooTallForCar(double carHeadroom) {
        return height > carHeadroom;
    }

    public boolean canDriveManual() {
        return canDriveStick;
    }
}
