package quintor.bioinf.nl.quintorcatalogbackend.webcontrol;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    void testGetName() {
        User user = new User("Mark");
        assertEquals("Mark", user.getName());

    }
}
