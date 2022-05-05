package tasks.task_5;

public class RejectedCall extends Call {

    public void setCallerName(String callerName) {
        super.callerName = callerName;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        super.telephoneNumber = telephoneNumber;
    }

    public void setDate(String date) {
        super.date = date;
    }

    public void setCallDurationSeconds(String callDurationSeconds) {
        super.callDurationSeconds = callDurationSeconds;
    }

    public String getCallerName() {
        return super.callerName;
    }

    @Override
    public void save(Call call) {
        if (!call.isReceived()) {
            super.save(call);
        }
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
