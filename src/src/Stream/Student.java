package Stream;

/**
 * @author : 赵静超
 * @date Date : 2019/10/28 22:20
 * @description :
 */
public class Student {

    private String leaveLable;
    private String leaveValue;

    public Student(String leaveLable, String leaveValue) {
        this.leaveLable = leaveLable;
        this.leaveValue = leaveValue;
    }

    public String getLeaveLable() {
        return leaveLable;
    }

    public void setLeaveLable(String leaveLable) {
        this.leaveLable = leaveLable;
    }

    public String getLeaveValue() {
        return leaveValue;
    }

    public void setLeaveValue(String leaveValue) {
        this.leaveValue = leaveValue;
    }

    @Override
    public String toString() {
        return "Student{" +
                "leaveLable='" + leaveLable + '\'' +
                ", leaveValue='" + leaveValue + '\'' +
                '}';
    }
}
