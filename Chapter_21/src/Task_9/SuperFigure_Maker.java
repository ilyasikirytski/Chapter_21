package Task_9;

public class SuperFigure_Maker implements Figure_Maker {
    private int countOfCells;

    public SuperFigure_Maker(int countOfCells) {
        this.countOfCells = countOfCells;
    }

    @Override
    public Figure createFigure() {
        return new SuperFigure(countOfCells);
    }
}
