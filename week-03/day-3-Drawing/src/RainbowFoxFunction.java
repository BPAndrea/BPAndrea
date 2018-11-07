import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowFoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        int a = 0;
        int r = 0;
        int g = 0;
        int b = 0;
        Color sColor = new Color(r, g, b);
        for (int i = 0; i < 8; i++) {
            a = (int) (Math.random() * 250);
            r = (int) (Math.random() * 256);
            g = (int) (Math.random() * 256);
            b = (int) (Math.random() * 256);
            sColor = new Color(r, g, b);
            centerBox(graphics, a, sColor);
        }
    }


    public static void centerBox(Graphics graphics, int a, Color b) {
        graphics.setColor(b);
        graphics.fillRect((WIDTH - a) / 2, (HEIGHT - a) / 2, a, a);
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
