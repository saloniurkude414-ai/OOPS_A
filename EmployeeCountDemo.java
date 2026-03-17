class EmployeeData {

    String name;
    int id;

    static int employeeCount = 0;

    EmployeeData(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    void display() {
        System.out.println("Employee ID: " + id + " Name: " + name);
    }

    static void displayCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class EmployeeCountDemo {

    public static void main(String[] args) {

        EmployeeData e1 = new EmployeeData("Rahul", 101);
        EmployeeData e2 = new EmployeeData("Priya", 102);
        EmployeeData e3 = new EmployeeData("Amit", 103);

        e1.display();
        e2.display();
        e3.display();

        EmployeeData.displayCount();
    }
}