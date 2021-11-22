package exercicio5;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class that represents the truck with its respective attributes of truck type, license plate, driver and also the list of pluviometers it carries.
 *
 * @author wagner.marcal
 * @version 1.0
 */
public class Truck {
    private final String truckType;
    private final String licensePlate;
    private final String driver;
    public List<Pluviometer> pluviometers = new ArrayList<>();

    /**
     * Constructor method that receives as parameters the type of truck, the driver and the license plate.
     *
     * @param truckType    String - Type of the truck.
     * @param driver       String - Driver's full name and age.
     * @param licensePlate String - Truck license plate.
     */
    public Truck(String truckType, String driver, String licensePlate) {
        this.truckType = truckType;
        this.driver = driver;
        this.licensePlate = licensePlate;
    }

    /**
     * Method for adding rain pluviometers to truck.
     *
     * @param pluviometer
     */
    public void pluviometerStock(Pluviometer pluviometer) {
        pluviometers.add(pluviometer);
    }

    /**
     * Method to return the truck type.
     *
     * @return truckType String - Truck type.
     */
    public String getTruckType() {
        return truckType;
    }


    /**
     * Method that returns the license plate from the truck.
     * @return licensePlate String - Returns the license plate from the truck.
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * Method to return the list of pluviometers that the truck is transporting.
     * @return pluviometers List<Pluviometer> - Returns the truck's pluviometers list.
     */
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
        char randomLetter = (char) (65 + r.nextInt(26));
        return String.valueOf(randomLetter);
    }

    /**
     * Method to return the total capacity in ml that the truck is transporting in pluviometers.
     * @return total int - Total truck capacity in ml of pluviometers.
     */
    public int getTotalCapacity() {
        int total = 0;
        for (Pluviometer p : pluviometers) {
            total += p.getPluvVolume();
        }
        return total;
    }

    /**
     * Method to return the fittest truck, the method must be called after sorting the list through the comparator.
     *
     * @param truckList - List of trucks.
     * @return String - The fittest truck
     */
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

