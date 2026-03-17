class PersonBase {
    void role() {
        System.out.println("Role: Person");
    }
}

class EmployeeRole extends PersonBase {
    void role() {
        System.out.println("Role: Employee");
    }
}

class ManagerRole extends EmployeeRole {
    void role() {
        System.out.println("Role: Manager");
    }
}

public class PersonInheritanceDemo {

    public static void main(String[] args) {

        PersonBase p;

        p = new PersonBase();
        p.role();

        p = new EmployeeRole();
        p.role();

        p = new ManagerRole();
        p.role();
    }
}