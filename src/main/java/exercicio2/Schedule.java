package exercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents an schedule, the schedule is of the list type and was declared in the first line of code.
 *
 * @author wagner.marcal
 * @version 1.0
 */
public class Schedule {
    private final List<Person> schedule;

    /**
     * Schedule constructor method that instantiates an ArrayList of type Person.
     */
    public Schedule() {
        schedule = new ArrayList<>(10);
    }

    /**
     * Method to store people in the schedule's ArrayList with a limit of 10 people, if true, it normally adds to the list, if false,
     * it returns an error message that it was not possible to include the object, along with its respective name.
     *
     * @param personToAdd Class Person - Object of class Person containing all attributes passed in the constructor of the Class itself.
     */
    public void addPerson(Person personToAdd) {
        if (arraySize() <= 10 - 1) {
            schedule.add(personToAdd);
        } else {
            System.out.println("Capacity exceeded! \nLimit of 10 people in the schedule. \nCould not add " +
                    personToAdd.getName() + " !!!");
        }
    }

    /**
     * Method for removing an object of class Person from the calendar list, also passes the name of the person who is removed in the console output.
     *
     * @param person Class Person - Objeto da classe Person contendo todos os atributos passados no construtor da própria classe
     */
    public void removePerson(Person person) {
        schedule.remove(person);
        System.out.println("Removing: " + person.getName());
    }

    /**
     * Method to fetch an object of class Person from the schedule list, returns the number of the index in which this person is.
     *
     * @param person Class Person - Object of class Person containing all attributes passed in the class's own constructor
     */
    public void findPerson(Person person) {
        System.out.println(schedule.indexOf(person));
        schedule.indexOf(person);
    }

    /**
     * Method for traversing the ArrayList by a logical repetition operator is printing all the data of the objects of the class Person that are instantiated in the schedule.
     */
    public void printSchedule() {
        for (Person p : schedule) {
            System.out.println(p.getData());
        }
    }

    /**
     * Method to print object of class Person from its integer corresponding to the index which represents it in the ArrayList.
     *
     * @param index int - Parameter containing the number of index in which the object of the class Person is inserted.
     */
    public void printPerson(int index) {
        System.out.println(schedule.get(index).getData());
    }

    /**
     * Method to return an integer from the size of the schedule's ArrayList.
     *
     * @return schedule.size int - Returns the integer of the size of the ArrayList.
     */
    public int arraySize() {
        return schedule.size();
    }
}
