package exercicio5;

import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.person.Person;

import static com.devskiller.jfairy.producer.person.PersonProperties.maxAge;
import static com.devskiller.jfairy.producer.person.PersonProperties.minAge;

public class Driver {
    private static final Fairy fairy = Fairy.create();

    public static String generateDriver() {
        Person driver = fairy.person(minAge(18), maxAge(65));
        return driver.getFullName() + " | " + "Age: " +
                driver.getAge();
    }
}
