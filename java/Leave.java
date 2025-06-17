public class Leave {
    private int employeeId;
    private String leaveDate;
    private String reason;

    public Leave(int employeeId, String leaveDate, String reason) {
        this.employeeId = employeeId;
        this.leaveDate = leaveDate;
        this.reason = reason;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public String getReason() {
        return reason;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Leave{" +
               "Employee ID = " + employeeId +
               ", Date = '" + leaveDate + '\'' +
               ", Reason = '" + reason + '\'' +
               '}';
    }
}
