import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    protected int id;
    protected String name;
    protected double baseSalary;
    protected List<Leave> leaveList = new ArrayList<>();

    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void applyLeave(Leave leave) {
        if (leaveList.size() < 1) {
            leaveList.add(leave);
            System.out.println("Leave applied successfully.");
        } else {
            System.out.println("Only 1 paid leave is allowed.");
        }
    }

    public List<Leave> getLeaveRecords() {
        return leaveList;
    }

    public abstract double calculateSalary();

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Base Salary: " + baseSalary;
    }
}
