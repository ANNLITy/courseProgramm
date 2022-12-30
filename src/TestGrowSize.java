public class TestGrowSize {
    private static int grow;
    private final int numberCreation;

    public TestGrowSize() {
        grow++;
        this.numberCreation = getGrow();
    }

    private int getGrow() {
        return grow;
    }

    public int getNumberCreation() {
        return numberCreation;
    }
}