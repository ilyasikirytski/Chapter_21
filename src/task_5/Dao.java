package task_5;

import task_5.Call;

import java.util.List;

public interface Dao<T> {
    Call get(String callerName);

    List<T> getAll();

    void save(T t);

    void updateByName(String callerName, String[] params);

    void deleteByName(String callerName);
}
