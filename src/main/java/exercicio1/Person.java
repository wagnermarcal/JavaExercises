package exercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * This class represents a person with the respective attributes.
 *
 * @author Wagner Marçal
 * @version 1.0
 */
public class Person {
    private String name;
    private String height;
    private LocalDate birthDate;
    private int age;

    /**
     * Constructor method of class Person, where the following parameters are passed:
     *
     * @param name      String - Person's name
     * @param birthDate String - Person's birthdate
     * @param height    String - Person's height
     */
    public Person(String name, String birthDate, String height) {
        this.setName(name);
        this.setBirthDate(birthDate);
        this.setHeight(height);
        this.getAge();
    }

    /**
     * Method for assigning a name to an object of class Person.
     *
     * @param name String - Person's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to return the object name of the Person class.
     *
     * @return name String - Person's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Method for assigning the date of birth to object of class Person.
     *
     * @param birthDate String - Person's birthdate
     */
    public void setBirthDate(String birthDate) {
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.birthDate = LocalDate.parse(birthDate, formatacao);
    }

    /**
     * Method to return the date of birth of the Person class object.
     *
     * @return birthdate String - Person's birthdate
     */
    public String getBirthDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedBirthDate = birthDate.format(formatter);
        return formattedBirthDate;
    }

    /**
     * Method for assigning height to object of class Person.
     *
     * @param height String - Person's height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * Method to return the height of the Person class object.
     *
     * @return height String - Person's height.
     */
    public String getHeight() {
        return this.height;
    }

    /**
     * Method to calculate the person's age, we use Period.between for the calculation,
     * which takes the current day's and subtract the birth date, then returns the age in years with .getYears();.
     */
    public void getAge() {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = this.birthDate;
        age = Period.between(birthDate, today).getYears();
    }

    /**
     * Method to print all object information of class Person to console.
     *
     * @return String - Return person data.
     */
    public String getData() {
        return String.format("Name: %s \nBirthdate: %s \nHeight: %s \nAge: %d", this.name, getBirthDate(), this.height, this.age);
    }
}
