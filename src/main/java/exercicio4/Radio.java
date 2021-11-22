package exercicio4;

/**
 * Class that simulates a radio with its respective attributes.
 *
 * @author wagner.marcal
 * @version 1.0
 */
public class Radio {
    private int volume = 0;
    private int station = 1;
    private final int maxVolume = 100;
    private final int lastStation = 300;

    /**
     * Method to increase the volume by one unit, however it will only increase the volume if it is not at the maximum, otherwise it will return an error message!
     */
    public void increaseVolume() {
        if (this.volume + 1 <= this.getMaxVolume()) {
            this.volume += 1;
            System.out.println("Increasing the volume " + "\nCurrent volume: " + getVolume());
        } else {
            System.out.println("Max volume reached!");
        }
    }

    /**
     * Method to decrease the volume by one unit, however it will only decrease the volume if it is not at the minimum, otherwise it will return an error message!
     */
    public void decreaseVolume() {
        if (this.volume - 1 > 0) {
            this.volume -= 1;
            System.out.println("Decreasing the volume " + "\nCurrent volume: " + getVolume());
        } else {
            System.out.println("You can no longer decrease the value, minimum 0 reached.");
        }
    }

    /**
     * Method to pass from one channel to another, it increments the channel by one unit, it will only go to the next channel if it is not in the last channel, if it is, it goes back to the first channel.
     */
    public void passStation() {
        if (this.station + 1 < lastStation) {
            this.station += 1;
            System.out.println("Moving on to the next station!\nCurrent station: " + this.station);
        } else {
            this.station = 1;
            System.out.println("Going back to the previous!\nCurrent station: " + this.station);
        }
    }

    /**
     * Method to go back from one channel to another, decrements the channel by one unit, it will only go to the previous channel if it is not in the first channel, if it is, it returns to the last channel.
     */
    public void backStation() {
        if (this.station - 1 > 0) {
            this.station -= 1;
            System.out.println("Moving to the previous station!\nCurrent station: " + this.station);
        } else {
            this.station = lastStation;
            System.out.println("Going back to the last station!\nCurrent station: " + this.station);
        }
    }

    /**
     * Method for querying the volume, returns the current volume of the television.
     */
    public void consultVolume() {
        System.out.println("Current volume: " + getVolume());
    }

    /**
     * Method to query the channel, returns the current volume of the channel.
     */
    public void consultStation() {
        System.out.println("Current station: " + getStation());
    }

    /**
     * Method to change stations, the new station is passed as parameter, the station cannot be less than or equal to 0 and must be less than the value of the last station.
     *
     * @param newStation int - Parameter that passes the value of the new channel as an integer.
     */
    public void changeStation(int newStation) {
        if (newStation > 0 && newStation <= this.getLastStation()) {
            setStation(newStation);
        } else {
            System.out.println("This station does not exist!");
        }
    }

    /**
     * Method to return the current volume, used only in the television class.
     *
     * @return volume int - Returns the integer value of the current volume.
     */
    private int getVolume() {
        return volume;
    }

    /**
     * Method to return the current station, used only in the radio class.
     *
     * @return canal int - Returns the integer value of the current station.
     */
    private int getStation() {
        return station;
    }

    /**
     * Method for setting the volume, used only in the radio class.
     *
     * @param volume int - Volume to be defined, represented by an integer.
     */
    private void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * Method to define a station, used only in the radio class.
     *
     * @param station int - Station to be defined, represented by an integer.
     */
    private void setStation(int station) {
        this.station = station;
    }

    /**
     * Method to return the maximum volume, used only in the radio class.
     *
     * @return maxVolume int - Returns the integer value of the maximum volume.
     */
    private int getMaxVolume() {
        return maxVolume;
    }

    /**
     * Method to return the last station, used only in the radio class.
     *
     * @return maxCanal int - Returns the integer value of the last channel.
     */
    private int getLastStation() {
        return lastStation;
    }
}
