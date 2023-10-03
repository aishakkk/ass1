public class FigureApp {
    public static void main(String[] args) {
        FigureDrawer figureDrawer = new FigureDrawer();

        figureDrawer.setFigure(new LineFigure());
        figureDrawer.drawFigure();

        figureDrawer.setFigure(new PointFigure());
        figureDrawer.drawFigure();

        figureDrawer.setFigure(new GradientFigure());
        figureDrawer.drawFigure();
    }
}