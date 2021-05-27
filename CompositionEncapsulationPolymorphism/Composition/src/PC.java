public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;


    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    // this allows access to other private methods
    public void PowerUp() {
        getTheCase().pressPowerButtion();
        drawLogo();
    }

    private void drawLogo() {
        System.out.println("Logo printed out");
        monitor.drawPixelAt(1200, 50, "yellow");
        // getMonitor().drawPixelAt(1200, 50, "yellow"); // this works the same as line above
    }

    // leaving these in for demonstration purposes, but they cannot be accessed from outside since they are private
    // a public method like PowerUp() is needed to access them indirectly
    private Case getTheCase() {
        return this.theCase;
    }

    private Monitor getMonitor() {
        return this.monitor;
    }

    private Motherboard getMotherboard() {
        return this.motherboard;
    }

}
