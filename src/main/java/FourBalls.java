import processing.core.PApplet;

import java.util.ArrayList;

public class FourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int NUMBER_OF_BALLS = 4;
    public static final double DISPLACEMENT_FACTOR = 0.2;
    private int frame = 0;

    private ArrayList<Ball> balls = new ArrayList<Ball>();

    public static void main(String[] args) {
        PApplet.main("FourBalls");
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int i = 0; i <= NUMBER_OF_BALLS; i++) {
            float height = (float) (HEIGHT * DISPLACEMENT_FACTOR * i);
            float speedFactor = i;
            balls.add(new Ball(speedFactor, height, this));
        }
    }

    @Override
    public void draw() {
        for (Ball ball: balls) {
            ball.draw(frame);
        }

        frame++;
    }
}
