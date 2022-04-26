package task_5.received_call;

import task_5.CallFactory;

public class ReceivedCallFactory implements CallFactory {

    @Override
    public ReceivedCall createCall() {
        return new ReceivedCall();
    }
}
