package Users.Employee;

import Users.User;

public class Employee {

    private User user;
    private int employeeId;

    public Employee(User user, int employeeId) {
        this.user = user;
        this.employeeId = employeeId;
    }

    public User getUser() {
        return user;
    }
}
