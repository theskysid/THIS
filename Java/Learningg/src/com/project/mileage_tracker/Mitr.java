import java.util.ArrayList;
import java.util.Scanner;

class FuelEntry {
    double odometer;
    double fuel;

    FuelEntry(double odometer, double fuel) {
        this.odometer = odometer;
        this.fuel = fuel;
    }
}

public class Mitr  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<FuelEntry> fuelEntries = new ArrayList<>();

        System.out.println("Enter the number of fuel entries:");
        int numberOfEntries = scanner.nextInt();

        for (int i = 0; i < numberOfEntries; i++) {
            System.out.println("Enter odometer reading for entry " + (i + 1) + ":");
            double odometer = scanner.nextDouble();
            System.out.println("Enter fuel added (in liters) for entry " + (i + 1) + ":");
            double fuel = scanner.nextDouble();
            fuelEntries.add(new FuelEntry(odometer, fuel));
        }

        // Calculate total distance traveled and total fuel consumed
        double totalDistance = 0;
        double totalFuel = 0;

        for (int i = 1; i < fuelEntries.size(); i++) {
            totalDistance += fuelEntries.get(i).odometer - fuelEntries.get(i - 1).odometer;
            totalFuel += fuelEntries.get(i).fuel;
        }

        // Calculate the average mileage
        double averageMileage = totalDistance / totalFuel;

        System.out.printf("Total Distance Traveled: %.2f km%n", totalDistance);
        System.out.printf("Total Fuel Consumed: %.2f liters%n", totalFuel);
        System.out.printf("Average Mileage: %.2f km/l%n", averageMileage);

        scanner.close();
    }
}
