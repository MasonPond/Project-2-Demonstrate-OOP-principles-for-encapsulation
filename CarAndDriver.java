import java.util.Scanner;

public class CarAndDriver {
    public static void main(String[] args) {
        System.out.println("Course: Java Advanced");
        System.out.println("Assignment: Project 2: Demonstrate OOP principles for encapsulation; include formal documentation.");
        System.out.println("Date: 02/04/2024");
        System.out.println("Student Name: Mason Pond\n");

        Scanner scanner = new Scanner(System.in);

        Car[] cars = new Car[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Car " + (i + 1) + ":");

            System.out.print("Car make: ");
            String make = scanner.nextLine();
            System.out.print("Car model: ");
            String model = scanner.nextLine();
            System.out.print("Car year: ");
            int year = scanner.nextInt();
            System.out.print("Car color: ");
            String color = scanner.next();
            System.out.print("Car headroom: ");
            double headroom = scanner.nextDouble();
            scanner.nextLine(); // consume the newline character
            System.out.print("Car transmission (manual or automatic): ");
            String transmission = scanner.nextLine();

            System.out.println("Enter details for the driver of Car " + (i + 1) + ":");
            System.out.print("Driver's name: ");
            String driverName = scanner.nextLine();
            System.out.print("Driver's age: ");
            int driverAge = scanner.nextInt();
            System.out.print("Driver's height: ");
            double driverHeight = scanner.nextDouble();
            scanner.nextLine(); // consume the newline character
            System.out.print("Can drive stick (yes or no): ");
            boolean canDriveStick = "yes".equalsIgnoreCase(scanner.nextLine().trim());

            Person driver = new Person(driverName, driverAge, driverHeight, canDriveStick);

            cars[i] = new Car(make, model, year, color, headroom, transmission, driver);

            System.out.println();
        }

        System.out.println("Car and Driver Details:\n");

        for (Car car : cars) {
            System.out.println(car);

            if (car.isDriverTooTall()) {
                System.out.println("Error: Driver is too tall for the car!");
            }

            if (car.isDriverUnableToDriveManual()) {
                System.out.println("Error: Driver cannot drive a manual transmission car!");
            }

            System.out.println();
        }

        scanner.close();
    }
}
