package tasks.task_9;

public class SuperFigure implements Figure {
    private final int countOfCells;

    public SuperFigure(int countOfCells) {
        this.countOfCells = countOfCells;
    }

    @Override
    public void fall() {
        System.out.println("figure " + countOfCells + " countOfCells");
    }
}
