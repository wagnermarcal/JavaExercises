package exercicio5;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Truck {
    private final String truckType;
    private final String licensePlate;
    private final String driver;
    public List<Pluviometer> pluviometers = new ArrayList<>();

    public Truck(String truckType, String driver, String licensePlate) {
        this.truckType = truckType;
        this.driver = driver;
        this.licensePlate = licensePlate;
    }

    public void pluviometerStock(Pluviometer pluviometer) {
        pluviometers.add(pluviometer);
    }

    public String getTruckType() {
        return truckType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public List<Pluviometer> getPluviometersList() {
        return pluviometers;
    }

    /**
     * Method to generate the truck's license plate through Random, the method uses the generateLetter() method to generate 3 random letters
     * and the decimal format to generate 4 random numbers in the necessary formatting.
     *
     * @return String - Returns the truck's license plate in the format "AAA - 9999".
     */
    public static String generateLicensePlate() {
        Random r = new Random();
        DecimalFormat df = new DecimalFormat("0000");
        return "[" + generateLetter() + generateLetter() + generateLetter() + " - " + df.format(r.nextInt(9999)) + "]";
    }

    public String getDriver() {
        return driver;
    }

    /**
     * Method for generating a random letter from A to (Z)
     *
     * @return String - Returns a random letter from the char converted to String.
     */
    public static String generateLetter() {
        Random r = new Random();
        char randomLetra = (char) (65 + r.nextInt(26));
        return String.valueOf(randomLetra);
    }

    public int getTotalCapacity() {
        int total = 0;
        for (Pluviometer p : pluviometers) {
            total += p.getVolumePluv();
        }
        return total;
    }

    public static String getTruckMoreApt(ArrayList<Truck> truckList) {
        Truck moreAptTruck = truckList.get(0);
        return "---------------------------------\n" +
                "The fittest truck is the truck:" +
                "\nType: " + moreAptTruck.getTruckType() +
                "\nDriver: " + moreAptTruck.getDriver() +
                "\nLicense Plate: " + moreAptTruck.getLicensePlate() +
                "\nTotal Capacity: " + moreAptTruck.getTotalCapacity() + "ml" +
                "\n---------------------------------";
    }

    @Override
    public String toString() {
        return "Truck Type: " + truckType +
                "\nLicense Plate: " + licensePlate +
                "\nPluviometer List: " + pluviometers + "\n";
    }
}

