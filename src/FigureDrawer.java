import java.util.ArrayList;
import java.util.List;

public class FigureDrawer {
    private Figure figure;
    private List<Observer> observers = new ArrayList<>();

    public void setFigure(Figure figure) {
        this.figure = figure;
        notifyObservers();
    }

    public void drawFigure() {
        if (figure != null) {
            figure.draw();
        } else {
            System.out.println("Выберите фигуру для отрисовки.");
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
