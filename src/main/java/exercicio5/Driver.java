package exercicio5;

import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.person.Person;

import static com.devskiller.jfairy.producer.person.PersonProperties.maxAge;
import static com.devskiller.jfairy.producer.person.PersonProperties.minAge;

/**
 * This class represents the truck driver.
 *
 * @author wagner.marcal
 * @version 1.0
 */
public class Driver {
    private static final Fairy fairy = Fairy.create();

    /**
     * This method is responsible for generating a random driver for the truck, this driver has a minimum age of 18 years and a maximum age of 65 years.
     *
     * @return String - Returns the truck driver with your full name and your age.
     */
    public static String generateDriver() {
        Person driver = fairy.person(minAge(18), maxAge(65));
        return driver.getFullName() + " | " + "Age: " +
                driver.getAge();
    }
}
