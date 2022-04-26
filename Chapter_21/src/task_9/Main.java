/*
Паттерн Factory Method. Фигуры игры «тетрис».
Реализовать процесс случайного выбора фигуры из конечного набора фигур.
Предусмотреть появление супер-фигур с большим числом клеток, чем обычные.
 */
package task_9;

public class Main {
    public static void main(String[] args) {
        Figure_Maker figure_maker = getFigureByCountOfCells(216);
        Figure figure = figure_maker.createFigure();
        figure.fall();
    }

    public static Figure_Maker getFigureByCountOfCells(int countOfCells) {
        if (countOfCells == 1) {
            return new Figure_1_Maker();
        } else if (countOfCells == 2) {
            return new Figure_2_Maker();
        } else if (countOfCells == 3) {
            return new Figure_3_Maker();
        } else if (countOfCells > 3) {
            return new SuperFigure_Maker(countOfCells);
        }
        throw new RuntimeException("Нет такой фигуры");
    }
}
