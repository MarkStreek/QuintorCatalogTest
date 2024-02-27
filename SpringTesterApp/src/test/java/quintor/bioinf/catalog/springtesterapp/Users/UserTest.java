package quintor.bioinf.catalog.springtesterapp.Users;

import Users.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import quintor.bioinf.catalog.springtesterapp.SpringTesterAppApplication;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserTest {

    @Test
    void getName3() {
        User user = new User("John Doe");
        assertEquals("John Doe", user.getName());
    }
}
