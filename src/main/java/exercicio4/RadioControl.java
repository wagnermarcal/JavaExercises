package exercicio4;

public class RadioControl extends Radio implements RemoteControlActions {

    /**
     * Method to increase the volume by one unit, however it will only increase the volume if it is not at the maximum, otherwise it will return an error message!
     */
    @Override
    public void increaseVolume() {
        super.increaseVolume();
    }

    /**
     * Method to decrease the volume by one unit, however it will only decrease the volume if it is not at the minimum, otherwise it will return an error message!
     */
    @Override
    public void decreaseVolume() {
        super.decreaseVolume();
    }

    /**
     * Method to pass from one station to another, it increments the station by one unit, it will only go to the next station if it is not in the last station, if it is, it goes back to the first station.
     */
    @Override
    public void passChannel() {
        super.passStation();
    }

    /**
     * Method to go back from one station to another, decrements the station by one unit, it will only go to the previous station if it is not in the first station, if it is, it returns to the last station.
     */
    @Override
    public void backChannel() {
        super.backStation();
    }

    /**
     * Method for querying the volume, returns the current radio volume.
     */
    @Override
    public void consultVolume() {
        super.consultVolume();
    }

    /**
     * Method for querying the station, returns the current station..
     */
    @Override
    public void consultChannel() {
        super.consultStation();
    }

    /**
     * Method to change stations, the new station is passed as parameter, the station cannot be less than or equal to 0 and must be less than the value of the last station.
     *
     * @param novoCanal int - Parameter that passes the value of the new station as an integer.
     */
    @Override
    public void changeChannel(int novoCanal) {
        super.changeStation(novoCanal);
    }
}

