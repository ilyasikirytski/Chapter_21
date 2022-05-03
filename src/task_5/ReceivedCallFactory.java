package task_5;

public class ReceivedCallFactory implements CallFactory {

    @Override
    public ReceivedCall createCall() {
        return new ReceivedCall();
    }
}
