package pl.dominisz.decemberstreams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static pl.dominisz.decemberstreams.OldestPerson.getOldestPerson;
import static pl.dominisz.decemberstreams.OldestPerson.getOldestPerson7;

/*
Get oldest person from the collection ; max
 */
public class OldestPersonTest {

    @Test
    public void getOldestPersonShouldReturnOldestPerson() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, viktor);
        assertEquals(getOldestPerson(collection), eva);
    }

    @Test
    public void getOldestPersonShouldReturnOldestPerson7() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, viktor);
        assertEquals(getOldestPerson7(collection), eva);
    }

}
