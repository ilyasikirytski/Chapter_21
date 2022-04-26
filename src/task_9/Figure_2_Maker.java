package task_9;

public class Figure_2_Maker implements Figure_Maker{
    @Override
    public Figure createFigure() {
        return new Figure_2();
    }
}
