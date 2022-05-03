package task_5;

public class RejectedCallFactory implements CallFactory {

    @Override
    public RejectedCall createCall() {
        return new RejectedCall();
    }
}
