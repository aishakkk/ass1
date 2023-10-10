public class FigureApp {
    public static void main(String[] args) {
        FigureDrawer figureDrawer = new FigureDrawer();

        Figure lineFigure = new LineFigure();
        Figure pointFigure = new PointFigure();
        Figure gradientFigure = new GradientFigure();

        // Decorate figures with color using ColorDecorator
        Figure coloredLineFigure = new ColorDecorator(lineFigure, "Red");
        Figure coloredPointFigure = new ColorDecorator(pointFigure, "Blue");
        Figure coloredGradientFigure = new ColorDecorator(gradientFigure, "Green");

        // Set and draw decorated figures
        figureDrawer.setFigure(coloredLineFigure);
        figureDrawer.drawFigure();

        figureDrawer.setFigure(coloredPointFigure);
        figureDrawer.drawFigure();

        figureDrawer.setFigure(coloredGradientFigure);
        figureDrawer.drawFigure();

        // Observer Pattern: Create observers and subscribe them to the FigureDrawer
        Observer lineObserver = new FigureObserver("Line Observer");
        Observer pointObserver = new FigureObserver("Point Observer");
        Observer gradientObserver = new FigureObserver("Gradient Observer");

        figureDrawer.addObserver(lineObserver);
        figureDrawer.addObserver(pointObserver);
        figureDrawer.addObserver(gradientObserver);

        // Change the figure to trigger the Observer pattern
        figureDrawer.setFigure(lineFigure);
        figureDrawer.drawFigure();

        figureDrawer.setFigure(pointFigure);
        figureDrawer.drawFigure();

        figureDrawer.setFigure(gradientFigure);
        figureDrawer.drawFigure();
    }
}
