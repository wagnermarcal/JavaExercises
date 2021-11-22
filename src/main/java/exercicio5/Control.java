package exercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Control {

    private static final Scanner scan = new Scanner(System.in);

    public static String readString() {
        return scan.nextLine();
    }

    public static int readInteger() {
        return scan.nextInt();
    }

    public static ArrayList<Truck> generateTrucks() {
        List<Truck> trucks = new ArrayList<>();
        AptTruck comparator = new AptTruck();
        Pluviometer p1 = new Pluviometer("A", 100);
        Pluviometer p2 = new Pluviometer("B", 200);
        boolean end = false;
        while (!end) {
            System.out.println("Select one of the options listed below: ");
            System.out.println("1. Include - Include trucks in the list along with the list of pluviometers to be transported.");
            System.out.println("2. End - The program ends and the fittest truck returns, the fittest truck is the one that carries the largest capacity in ml of rain gauges.");
            String option = Control.readString();
            Truck truck = null;
            switch (option) {

                case "1":
                    System.out.println("What type of truck do you want to include?\n1. Alfa\n2. Beta");
                    String truckType = Control.readString();
                    switch (truckType) {

                        case "1":
                            truck = new Truck("Alfa", Driver.generateDriver(), Truck.generateLicensePlate());
                            break;

                        case "2":
                            truck = new Truck("Beta", Driver.generateDriver(), Truck.generateLicensePlate());
                            break;

                        default:
                            System.out.println("Please, select a valid option!");
                            break;

                    }
                    System.out.println("How many pluviometers do you want to load onto the truck?");
                    int nPluv = Control.readInteger();
                    Control.readString();
                    for (int i = 0; i < nPluv; i++) {
                        System.out.println("What type of pluviometer do you want to add?\nPluviometer N°" + (i + 1) + "\n1. A - 100ml\n2. B - 200ml");
                        String pluvType = Control.readString();
                        boolean validPluvType = true;

                        switch (pluvType) {
                            case "1":
                                truck.pluviometerStock(p1);
                                continue;
                            case "2":
                                truck.pluviometerStock(p2);
                                continue;
                            default:
                                System.out.println("Please, select a valid pluviometer type option!");
                                break;
                        }

                    }
                    trucks.add(truck);
                    assert truck != null;
                    continue;

                case "2":
                    System.out.println("Ending the program!");
                    end = true;
                    break;

            }
        }
        return (ArrayList<Truck>) trucks;
    }
}
