class FigureDrawer {
    private Figure figure;

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public void drawFigure() {
        if (figure != null) {
            figure.draw();
        } else {
            System.out.println("Выберите фигуру для отрисовки.");
        }
    }
}