package exercicio5;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

/**
 * This class represents the control of trucks and pluviometers, it also reads user inputs.
 *
 * @author wagner.marcal
 * @version 1.0
 */
public class Control implements Serializable {
    private static final long serialVersionUID = Truck.serialVersionUID;

    /**
     * Method for validating user input.
     *
     * @param intString String - User input in String format
     * @return boolean - Returns true if the String input can be converted to an integer, otherwise false.
     */
    private static boolean inputChecker(String intString) {
        try {
            Integer.parseInt(intString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Method to convert user input into an integer after validation performed by the method inputChecker();
     *
     * @param input String - User input.
     * @return int - Returns an integer from conversion.
     */
    private static int intReturner(String input) {
        while (!inputChecker(input)) {
            input = JOptionPane.showInputDialog(null, "Incorrect value!\n\nType a int number.");
        }
        return Integer.parseInt(input);
    }

    /**
     * Method that generates the trucks with the respective pluviometers that will transport, each truck has a license plate and a driver.
     *
     * @return ArrayList<Truck> - Returns a list of trucks
     */
    public static ArrayList<Truck> generateTrucks() {
        ArrayList<Truck> trucks = new ArrayList<>();
        Pluviometer p1 = new Pluviometer("A", 100);
        Pluviometer p2 = new Pluviometer("B", 200);
        boolean end = false;
        while (!end) {
            int principalMenuOption = getPrincipalMenuOption();
            Truck truck = null;
            switch (principalMenuOption) {
                case 1:
                    int truckTypeMenuOption = getTruckTypeMenuOption();
                    switch (truckTypeMenuOption) {
                        case 1:
                            truck = new Truck("Alfa", Driver.generateDriver(), Truck.generateLicensePlate());
                            break;
                        case 2:
                            truck = new Truck("Beta", Driver.generateDriver(), Truck.generateLicensePlate());
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Please choose a valid truck type!");
                            continue;
                    }
                    int pluviometerAmountUserOption = getPluviometerAmountUserOption();
                    for (int i = 0; i < pluviometerAmountUserOption; i++) {
                        int pluviometerTypeUserOption = getPluviometerTypeUserOption(p1, p2, i);
                        switch (pluviometerTypeUserOption) {
                            case 1:
                                truck.pluviometerStock(p1);
                                continue;
                            case 2:
                                truck.pluviometerStock(p2);
                                continue;
                            default:
                                JOptionPane.showMessageDialog(null, "Please, select a valid pluviometer type option!");
                                break;
                        }
                    }
                    trucks.add(truck);
                    assert truck != null;
                    continue;
                case 2:
                    showTrucksList(trucks);
                    break;
                case 3:
                    deleteTrucksList(trucks);
                    break;
                case 4:
                    if (!trucks.isEmpty()) {
                        recordData(trucks);
                        JOptionPane.showMessageDialog(null, "Data saved successfully!");
                    } else {
                        JOptionPane.showMessageDialog(null, "No data to save!");
                    }
                    break;
                case 5:
                    if (trucks.isEmpty()) {
                        trucks = recoverData();
                        JOptionPane.showMessageDialog(null, "Data retrieved successfully!");
                    } else {
                        JOptionPane.showMessageDialog(null, "There is no data to be recovered!");
                    }
                    break;
                case 6:
                    if (!trucks.isEmpty()) {
                        trucks.sort(comparing(t -> t.getTotalCapacity()));
                        trucks.sort(Comparator.<Truck>reverseOrder());
                        JOptionPane.showMessageDialog(null, "The more fittest truck are: " + trucks.get(0));
                    } else {
                        JOptionPane.showMessageDialog(null, "There is no fitter truck, as none has been inserted.");
                    }
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Ending the program!");
                    end = true;
                    break;
            }
        }
        return trucks;
    }

    /**
     * Método que contém as opções de pluviômetros, retorna como inteiro a opção do usuário.
     *
     * @param p1 Pluviometer - Take p1 as a parameter to use its methods
     * @param p2 Pluviometer - Take p2 as a parameter to use its methods
     * @param i  int - List iteration, to control which iteration it's on.
     * @return int - User pluviometer option
     */
    private static int getPluviometerTypeUserOption(Pluviometer p1, Pluviometer p2, int i) {
        String pluviometerTypeMenu;
        String pluviometerTypeUserInput;
        pluviometerTypeMenu = "What type of pluviometer do you want to add?" +
                "\nPluviometer N°" + (i + 1) +
                "\n1. " + p1.getPluvType() + " - " + p1.getPluvVolume() + " ml" +
                "\n2. " + p2.getPluvType() + " - " + p2.getPluvVolume() + " ml";
        pluviometerTypeUserInput = JOptionPane.showInputDialog(pluviometerTypeMenu);
        return intReturner(pluviometerTypeUserInput);
    }

    /**
     * Method that contains the selection of the amount of pluviometers by the user, returns the input as an integer with the amount.
     *
     * @return int - User pluviometers amount option
     */
    private static int getPluviometerAmountUserOption() {
        String pluviometersAmountMenu;
        String pluviometersAmountUserInput;
        pluviometersAmountMenu = "How many pluviometers do you want to load onto the truck?";
        pluviometersAmountUserInput = JOptionPane.showInputDialog(pluviometersAmountMenu);
        return intReturner(pluviometersAmountUserInput);
    }


    /**
     * Method that contains the truck type selection menu with its respective options, returns the user input as an integer.
     *
     * @return int - User truck option
     */
    private static int getTruckTypeMenuOption() {
        String optionsTruckTypeMenu;
        String truckTypeMenuUserInput;
        optionsTruckTypeMenu = "What type of truck do you want to include?\n" +
                "1. Alfa\n" +
                "2. Beta\n";
        truckTypeMenuUserInput = JOptionPane.showInputDialog(optionsTruckTypeMenu);
        return intReturner(truckTypeMenuUserInput);
    }

    /**
     * Method that contains the menu with the respective options and returns the input in integer form with the user option
     *
     * @return int - User menu option
     */
    private static int getPrincipalMenuOption() {
        String optionsPrincipalMenu;
        String principalMenuUserInput;
        optionsPrincipalMenu = "Select one of the options listed below:\n" +
                "1. Include Truck\n" +
                "2. Show truck list\n" +
                "3. Delete truck list\n" +
                "4. Record trucks\n" +
                "5. Recovery trucks\n" +
                "6. Show the fittest truck\n" +
                "9. End\n";
        principalMenuUserInput = JOptionPane.showInputDialog(optionsPrincipalMenu);
        return intReturner(principalMenuUserInput);
    }

    /**
     * Method to clear truck list, delete all trucks from the list.
     *
     * @param trucks - Receives a list of Truck as a parameter
     */
    private static void deleteTrucksList(List<Truck> trucks) {
        if (!trucks.isEmpty()) {
            trucks.clear();
        } else {
            JOptionPane.showMessageDialog(null, "There are no trucks to be cleaned!");
        }
    }

    /**
     * Method to show all trucks that are entered in the list.
     *
     * @param trucks - Receives a list of Truck as a parameter
     */
    private static void showTrucksList(List<Truck> trucks) {
        if (!trucks.isEmpty()) {
            for (Truck l : trucks) {
                Truck trucksList = (trucks.get(trucks.indexOf(l)));
                JOptionPane.showMessageDialog(null, trucksList);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You haven't registered any trucks yet!\n" +
                    "Try to add or retrieve them\n");
        }
    }

    /**
     * Method for recording trucks that have been entered into a .txt file
     *
     * @param trucks - Receives a list of Truck as a parameter.
     */
    private static void recordData(List<Truck> trucks) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("truckslist.txt"));
            for (Truck trucksList : trucks) {
                outputStream.writeObject(trucksList);
            }
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to retrieve trucks from trucks that have been recorded in the .txt file
     *
     * @return List<Truck> - Returns a list of trucks
     */
    @SuppressWarnings("finally")
    private static ArrayList<Truck> recoverData() {
        ArrayList<Truck> trucksTemp = new ArrayList<>();
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(new FileInputStream("truckslist.txt"));
            Object o;
            while ((o = inputStream.readObject()) != null) {
                if (o instanceof Truck) {
                    trucksTemp.add((Truck) o);
                }
            }
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (final IOException ex) {
                ex.printStackTrace();
            }
            return trucksTemp;
        }
    }
}
