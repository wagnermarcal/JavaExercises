package exercicio5;

/**
 * Class that represents a pluviometer with its respective type and capacity.
 *
 * @author wagner.marcal
 * @version 1.0
 */
public class Pluviometer {
    private final String pluvType;
    private final int pluvVolume;

    /**
     * Constructor method of the Pluviometer class.
     *
     * @param type String - Pluviometer type "Type 1" or "Type 2".
     * @param ml   int - Pluviometer capacity in ml.
     */
    public Pluviometer(String type, int ml) {
        pluvType = type;
        pluvVolume = ml;
    }

    /**
     * Method to return the volume capacity of the pluviometer.
     *
     * @return pluvVolume int - Returns the volume capacity of the pluviometer in ml.
     */
    public int getPluvVolume() {
        return pluvVolume;
    }

    /**
     * Method to return the pluviometer type.
     *
     * @return pluvType String - Returns the pluviometer type.
     */
    public String getPluvType() {
        return this.pluvType;
    }

    @Override
    public String toString() {
        return "\nPluviometer Type: " + pluvType +
                "\nPluviometer volume: " + pluvVolume + "\n";
    }
}
