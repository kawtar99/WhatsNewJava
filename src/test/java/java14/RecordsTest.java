package java14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecordsTest {

    @Test
    public void createPersonRecord(){
        Records.Person person = Records.createPerson("name", "address");

        // Since records are immutable objects, there are only getter methods
        assertEquals(person.name(), "name");
        assertEquals(person.address(), "address");
    }

}