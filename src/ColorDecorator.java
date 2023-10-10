public class ColorDecorator extends FigureDecorator {
    private String color;

    public ColorDecorator(Figure decoratedFigure, String color) {
        super(decoratedFigure);
        this.color = color;
    }

    @Override
    protected void addColor() {
        System.out.println("Adding color: " + color);
    }
}
