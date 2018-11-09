
import javax.swing.*;
import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        for (int i = 0; i < 8; i++) {

            graphics.setColor(Color.GREEN);
            graphics.drawLine((WIDTH/4)+i * (WIDTH/32), WIDTH/2, (HEIGHT/2), (WIDTH/4)-i * (WIDTH/32));
            graphics.drawLine((WIDTH/4)-i * (WIDTH/32), WIDTH/2, (HEIGHT/2), (WIDTH/4)+i * (WIDTH/32));

            graphics.drawLine(3*(WIDTH/4)-i*(WIDTH/32), WIDTH/2, (HEIGHT/2), (WIDTH/4)-i * (WIDTH/32));
            graphics.drawLine(3*(WIDTH/4)+i*(WIDTH/32), WIDTH/2, (HEIGHT/2), (WIDTH/4)+i * (WIDTH/32));

            graphics.drawLine((WIDTH/4)+i * (WIDTH/32), WIDTH/2, (HEIGHT/2), 3*(WIDTH/4)+i * (WIDTH/32));
            graphics.drawLine((WIDTH/4)-i * (WIDTH/32), WIDTH/2, (HEIGHT/2), 3*(WIDTH/4)-i * (WIDTH/32));

            graphics.drawLine(3*(WIDTH/4)-i * (WIDTH/32), WIDTH/2, (HEIGHT/2), 3*(WIDTH/4)+i * (WIDTH/32));
            graphics.drawLine(3*(WIDTH/4)+i * (WIDTH/32), WIDTH/2, (HEIGHT/2), 3*(WIDTH/4)-i * (WIDTH/32));

            graphics.drawLine((WIDTH/2),0, WIDTH/2, WIDTH);
        }
    }

    public static void linePlay(Graphics graphics, int x, int y) {

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

