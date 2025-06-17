public class PermanentEmployee extends Employee {
    public PermanentEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        int leavesTaken = leaveList.size();
        double penalty = 0.0;
        if (leavesTaken > 1) {
            penalty = (leavesTaken - 1) * 100;
        }
        return baseSalary - penalty;
    }
}
