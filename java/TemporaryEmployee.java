public class TemporaryEmployee extends Employee {
    public TemporaryEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        int leavesTaken = leaveList.size();
        double penalty = 0.0;
        if (leavesTaken > 1) {
            penalty = (leavesTaken - 1) * 50;
        }
        return baseSalary - penalty;
    }
}
