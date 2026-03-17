class EmployeeThisUnique {

    String name;
    double salary;

    EmployeeThisUnique(String name, double salary) {
        this.name = name;   // this keyword assigns constructor params
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeThisDemo {

    public static void main(String[] args) {

        EmployeeThisUnique e1 = new EmployeeThisUnique("Rahul", 40000);
        EmployeeThisUnique e2 = new EmployeeThisUnique("Priya", 50000);

        e1.display();
        e2.display();
    }
}