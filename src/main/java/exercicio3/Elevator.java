package exercicio3;

/**
 * This class represents an elevator with its respective attributes and methods.
 *
 * @author wagner.marcal
 * @version 1.0
 */
public class Elevator {
    private int totalFloors, currentElevatorFloor, personsInElevator;
    private final int groundFloor = 0;
    private double elevatorCapacity;

    /**
     * Method initialize to start using the elevator, the parameters are passed:
     *
     * @param elevatorCapacity double - Elevator capacity.
     * @param totalFloors      int - Total building floors.
     *                         <p>
     *                         The attributes of the current floor and people in the elevator are also set to 0 at startup.
     */
    public void initialize(double elevatorCapacity, int totalFloors) {
        this.elevatorCapacity = elevatorCapacity;
        this.totalFloors = totalFloors;
        this.currentElevatorFloor = groundFloor;
        this.personsInElevator = 0;
        System.out.println("----------------------------\nInitializing elevator!\n----------------------------");
    }

    /**
     * Method for people to enter the elevator, a check is carried out to confirm that it does not exceed capacity, if it does, it returns an error message!
     *
     * @param peopleAmount int - Number of people who will enter the elevator.
     */
    public void enter(int peopleAmount) {
        if (personsInElevator + peopleAmount <= elevatorCapacity) {
            this.personsInElevator += peopleAmount;
            System.out.println(peopleAmount + " people entered the elevator, now we have " + personsInElevator + " in total");
        } else {
            System.out.println("Capacity exceeded!");
        }
    }

    /**
     * Method for people leaving the elevator, a check is carried out to confirm that the number of people leaving the
     * elevator is not greater than the number of people in the elevator, if so, it returns an error message!
     *
     * @param peopleAmount int - Number of people who will leave the elevator.
     */
    public void leave(int peopleAmount) {
        if (personsInElevator - peopleAmount >= 0) {
            this.personsInElevator -= peopleAmount;
            System.out.println(peopleAmount + " people left the elevator, now we have " + personsInElevator + " in total");
        } else {
            System.out.println("There aren't that many people in the elevator!");
        }
    }

    /**
     * Method for the elevator to go up through the floors, a check is carried out to confirm that the floor it will go up does
     * not exceed the total number of floors in the building, if it does, it returns an error message!
     *
     * @param floors int - Amount of floors to go up.
     */
    public void up(int floors) {
        if (currentElevatorFloor + floors < totalFloors) {
            this.currentElevatorFloor += floors;
            System.out.println("Going up " +  floors + " floors in the elevator, we are now on floor: " + currentElevatorFloor);
        } else {
            System.out.println("The building doesn't have that many floors!");
        }
    }

    /**
     * Method for the elevator to descend through the floors, a check is carried out to confirm that the floor it will
     * descend is not lower than floor 0 - Ground floor, if lower, returns an error message!
     *
     * @param floors int - Amount of floors to go down.
     */
    public void down(int floors) {
        if (currentElevatorFloor - floors >= 0) {
            this.currentElevatorFloor -= floors;
            System.out.println("Going down " + floors + " floors in the elevator, now we are on floor: " + currentElevatorFloor);
        } else {
            System.out.println("It is not possible to go down so many floors, it is only possible to go down to the ground floor!");
        }
    }

    /**
     * Method to return the number of floors in the building.
     *
     * @return String - Total floors in the building.
     */
    public String getTotalFloors() {
        return "Total floors in the building: " + totalFloors;
    }

    /**
     * Method for returning the floor that represents the ground floor, by default 0.
     *
     * @return String - Ground floor.
     */
    public String getGroundFloor() {
        return "The number that represents the ground is the number: " + groundFloor;
    }

    /**
     * Method to return the current floor the elevator is on.
     *
     * @return String - Current elevator floor.
     */
    public String getCurrentElevatorFloor() {
        return "Current elevator floor: " + currentElevatorFloor;
    }

    /**
     * Method to return elevator capacity.
     *
     * @return String - Elevator capacity.
     */
    public String getElevatorCapacity() {
        return "Elevator capacity: " + elevatorCapacity;
    }

    /**
     * Method to return the number of people who are currently in the elevator.
     *
     * @return String - People in the elevator.
     */
    public String getPersonsInElevator() {
        return "Current number of people in the elevator: " + personsInElevator;
    }
}
