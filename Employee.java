public class Employee {
    private String name;
    private String department;
    private Resources resources;

    public Employee(String name, String department, Resources resources) {
        this.name = name;
        this.department = department;
        this.resources = resources;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public Resources getResources() { return resources; }
    public void setResources(Resources resources) { this.resources = resources; }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Desktop Assigned: " + resources.getDesktop());
        System.out.println("Chair Assigned: " + resources.getChair());
        System.out.println("***********************************");
    }
}