import java.util.ArrayList;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {
        List<Truck> trucks = new ArrayList<>();

        Pluviometer p1 = new Pluviometer("A", 100);
        Pluviometer p2 = new Pluviometer("B", 200);
        boolean end = false;
        while (!end) {
            System.out.println("Select one of the options listed below: ");
            System.out.println("1. Include - Include trucks in the list along with the list of rain gauges to be transported.");
            System.out.println("2. End - The program ends and the fittest truck returns, the fittest truck is the one that carries the largest capacity in ml of rain gauges.");
            int option = Control.readInteger();
            Truck truck = null;
            switch (option) {
                case 1:
                    System.out.println("What type of truck do you want to include?\n1. Alfa\n2. Beta");
                    int truckType = Control.readInteger();
                    boolean validTruckType = true;
                    switch (truckType) {
                        case 1:
                            truck = new Truck("Alfa", Truck.generateLicensePlate());
                            break;
                        case 2:
                            truck = new Truck("Beta", Truck.generateLicensePlate());
                            break;
                        default:
                            System.out.println("Please, select a valid option!");
                            validTruckType = false;
                    }
                    if (!validTruckType) {
                        break;
                    }
                    System.out.println("How many pluviometers do you want to load onto the truck?");
                    int nPluv = Control.readInteger();
                    for (int i = 0; i < nPluv; i++) {
                        System.out.println("What type of pluviometer do you want to add?\n1. A - 100ml\n2. B - 200ml");
                        int pluvType = Control.readInteger();
                        System.out.println("Type of pluviometer N°" + (i + 1));
                        switch (pluvType) {
                            case 1:
                                truck.pluviometerStock(p1);
                            case 2:
                                truck.pluviometerStock(p2);
                        }
                    }
                    trucks.add(truck);
                    System.out.println(Control.getTotalCapacity());
                    continue;
                case 2:
                    System.out.println("Ending the program!");
                    end = true;
                    break;
            }
        }
    }
}
