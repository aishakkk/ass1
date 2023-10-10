public abstract class FigureDecorator implements Figure {
    protected Figure decoratedFigure;

    public FigureDecorator(Figure decoratedFigure) {
        this.decoratedFigure = decoratedFigure;
    }

    @Override
    public void draw() {
        decoratedFigure.draw();
        addColor();
    }

    protected abstract void addColor();
}
