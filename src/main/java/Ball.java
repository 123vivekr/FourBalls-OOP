import processing.core.PApplet;

public class Ball {
        public static final int DIAMETER = 10;
        private float height;
        private float speedFactor;
        private PApplet papplet;

        public Ball(float speedFactor, float height, PApplet papplet) {
                this.speedFactor = speedFactor;
                this.height = height;
                this.papplet = papplet;
        }

        public void draw(int frame) {
                float xAxis = (float) (frame * this.speedFactor);

                papplet.ellipse(xAxis, (float) this.height,  DIAMETER, DIAMETER);
        }
}
