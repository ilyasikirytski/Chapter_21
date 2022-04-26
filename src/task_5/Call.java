package task_5;

import task_5.dao_pattern.CallDao;

public class Call extends CallDao {
    public boolean isReceived;
    public String callerName;
    public String telephoneNumber;
    public String date;
    public String callDurationSeconds;

    public Call(boolean isReceived, String callerName, String telephoneNumber, String date, String callDurationSeconds) {
        this.isReceived = isReceived;
        this.callerName = callerName;
        this.telephoneNumber = telephoneNumber;
        this.date = date;
        this.callDurationSeconds = callDurationSeconds;
    }

    public Call() {
    }

    public boolean isReceived() {
        return isReceived;
    }

    public String getCallerName() {
        return callerName;
    }

    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCallDurationSeconds(String callDurationSeconds) {
        this.callDurationSeconds = callDurationSeconds;
    }

    @Override
    public String toString() {
        return "Call{" +
                "isReceived=" + isReceived +
                ", callerName='" + callerName + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", date='" + date + '\'' +
                ", callDurationSeconds='" + callDurationSeconds + '\'' +
                '}';
    }
}
