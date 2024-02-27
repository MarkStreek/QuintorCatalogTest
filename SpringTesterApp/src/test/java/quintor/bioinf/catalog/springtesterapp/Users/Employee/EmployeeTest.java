package quintor.bioinf.catalog.springtesterapp.Users.Employee;

import Users.Employee.Employee;
import Users.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeTest {

    @Test
    void getUser() {
        User user = new User("John Doe");
        Employee employee = new Employee(user, 1);
        assertEquals(user, employee.getUser());
    }
}