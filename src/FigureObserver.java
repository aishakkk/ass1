public class FigureObserver implements Observer {
    private String name;

    public FigureObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + " has been notified of the figure change.");
    }
}
