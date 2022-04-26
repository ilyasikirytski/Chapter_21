package task_5.rejected_call;

import task_5.CallFactory;

public class RejectedCallFactory implements CallFactory {

    @Override
    public RejectedCall createCall() {
        return new RejectedCall();
    }
}
