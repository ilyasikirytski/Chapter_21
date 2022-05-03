/*
Паттерн Abstract Factory. Написать код приложения,
позволяющий универсально записывать данные о совершенном телефонном звонке в базу данных и xml-файл,
а также считывать эту информацию. Использовать также шаблон DAO.
 */
package task_5;

public class Main {
    public static void main(String[] args) {
        CallFactory callFactory = getCallFactory(true);
        Call call = callFactory.createCall();
        call.save(new Call(true, "1111", "375444567891", "12.03.2004", "24"));
        call.save(new Call(false, "1111", "375444567891", "12.03.2004", "24"));
        call.save(new Call(true, "1111", "375444567891", "12.03.2004", "24"));

        for (Call c : call.getAll()) {
            System.out.println(c);
        }

    }

    public static CallFactory getCallFactory(boolean isReceived) {
        if (isReceived) {
            return new ReceivedCallFactory();
        }
        return new RejectedCallFactory();
    }
}
