public class Dcis {
    public static void main(String[] args) {
        // Create Resources for each employee
        Resources res1 = new Resources("Dell ", "Ergonomic Chair");
        Resources res2 = new Resources("HP ", "Standard Chair");
        Resources res3 = new Resources("Lenovo ", "Mesh Chair");
        Resources res4 = new Resources("Apple ", "Executive Chair");
        Resources res5 = new Resources("Asus ", "Gaming Chair");

        // Create 5 Employees
        Employee emp1 = new Employee("Alice", "Engineering", res1);
        Employee emp2 = new Employee("Bob", "QA", res2);
        Employee emp3 = new Employee("Charlie", "Engineering", res3);
        Employee emp4 = new Employee("Diana", "QA", res4);
        Employee emp5 = new Employee("Ethan", "Engineering", res5);

        // Display all employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();
        emp4.displayEmployeeDetails();
        emp5.displayEmployeeDetails();
    }
}