package task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CallDao implements Dao<Call> {
    private final List<Call> calls = new ArrayList<>();

    @Override
    public Call get(String callerName) {
        for (Call call : calls) {
            if (call.getCallerName().equals(callerName)) {
                return call;
            }
        }
        return null;
    }

    @Override
    public List<Call> getAll() {
        return calls;
    }

    @Override
    public void save(Call call) {
        calls.add(call);
    }

    @Override
    public void updateByName(String callerName, String[] params) {
        for (Call call : calls) {
            if (call.getCallerName().equals(callerName)) {
                call.setCallerName(Objects.requireNonNull(params[0]));
                call.setTelephoneNumber(Objects.requireNonNull(params[1]));
                call.setDate(Objects.requireNonNull(params[2]));
                call.setCallDurationSeconds(Objects.requireNonNull(params[3]));
            }
        }
    }

    @Override
    public void deleteByName(String callerName) {
        calls.removeIf(call -> call.getCallerName().equals(callerName));
    }
}
