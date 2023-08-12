import java.util.Random;

class Die {
    private int faceValue;
    private Random random;

    public Die() {
        random = new Random();
        faceValue = 1; // Initial face value
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void roll() {
        faceValue = random.nextInt(6) + 1; // Rolling a 6-sided die
    }
}
