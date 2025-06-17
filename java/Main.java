import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Map<Integer, Employee> employeeMap = new HashMap<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Leave Tracker Menu =====");
            System.out.println("1. Add Permanent Employee");
            System.out.println("2. Add Temporary Employee");
            System.out.println("3. Apply Leave");
            System.out.println("4. View Leave Records");
            System.out.println("5. Calculate Salary");
            System.out.println("6. View All Employees");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // clear buffer

            switch (choice) {
                case 1:
                    addEmployee("P");
                    break;
                case 2:
                    addEmployee("T");
                    break;
                case 3:
                    applyLeave();
                    break;
                case 4:
                    viewLeaves();
                    break;
                case 5:
                    calculateSalary();
                    break;
                case 6:
                    viewAllEmployees();
                    break;
                case 7:
                    System.out.println("Thank you! Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        } while (choice != 7);
    }

    static void addEmployee(String type) {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Base Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        Employee emp;
        if (type.equals("P")) {
            emp = new PermanentEmployee(id, name, salary);
        } else {
            emp = new TemporaryEmployee(id, name, salary);
        }

        employeeMap.put(id, emp);
        System.out.println((type.equals("P") ? "Permanent" : "Temporary") + " employee added successfully.");
    }

    static void applyLeave() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Employee emp = employeeMap.get(id);
        if (emp == null) {
            System.out.println("Employee not found.");
            return;
        }

        System.out.print("Enter Leave Date (yyyy-mm-dd): ");
        String date = scanner.nextLine();

        System.out.print("Enter Reason: ");
        String reason = scanner.nextLine();

        Leave leave = new Leave(id, date, reason);
        emp.applyLeave(leave);
        System.out.println("Leave applied successfully.");
    }

    static void viewLeaves() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Employee emp = employeeMap.get(id);
        if (emp == null) {
            System.out.println("Employee not found.");
            return;
        }

        System.out.println("\nLeave Records for " + emp.name + ":");
        List<Leave> leaves = emp.getLeaveRecords();
        if (leaves.isEmpty()) {
            System.out.println("No leaves taken.");
        } else {
            for (Leave l : leaves) {
                System.out.println("- " + l);
            }
        }
    }

    static void calculateSalary() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Employee emp = employeeMap.get(id);
        if (emp == null) {
            System.out.println("Employee not found.");
            return;
        }

        System.out.println("Salary for " + emp.name + " after leaves: ₹" + emp.calculateSalary());
    }

    static void viewAllEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        System.out.println("\nAll Employees:");
        for (Employee emp : employeeMap.values()) {
            System.out.println(emp);
        }
    }
}
