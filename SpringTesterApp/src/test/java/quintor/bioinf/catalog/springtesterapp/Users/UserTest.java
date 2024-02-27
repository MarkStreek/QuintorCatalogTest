package quintor.bioinf.catalog.springtesterapp.Users;

import Users.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {

    @Test
    void getName() {
        User user = new User("John");
        assert user.getName().equals("John");
    }
}
