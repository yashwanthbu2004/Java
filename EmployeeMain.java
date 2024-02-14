class Employee {
    String name;
    String jobTitle;
    double basicSalary;
    double incentive;


    Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.basicSalary = 50000;
        this.incentive = 0;
    }

    Employee(String name, String jobTitle, double incentive) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.basicSalary = 50000;
        this.incentive = incentive;
    }

    double calculateSalary() {
        double hra = 0.12 * basicSalary;
        double da = 0.05 * basicSalary;
        return basicSalary + hra + da;
    }

    double calculateSalaryWithIncentive() {
        double grossSalary;
        grossSalary = calculateSalary() + incentive;
        return grossSalary;
    }


    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Incentive: " + incentive);
    }

}
public class EmployeeMain {
    public static void main(String[] args) {

        Employee emp1 = new Employee("John", "Software Engineer");
        Employee emp2 = new Employee("Jane", "Manager", 1500);

        emp1.displayDetails();
        System.out.println("Salary without incentive: " + emp1.calculateSalary());

        System.out.println();

        emp2.displayDetails();
        System.out.println("Salary with incentive: " + emp2.calculateSalaryWithIncentive());
    }
}