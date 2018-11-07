import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        //Solution No 1.:
            /*for (int i = 0; i < 320; i+=20) {
                int x=0;
                int y=i;
                toCenter(graphics, x, y);
            }
            for (int i = 0; i < 320; i+=20) {
                int x=WIDTH;
                int y=i;
                toCenter(graphics, x, y);
            }
            for (int i = 0; i < 320; i+=20) {
                int x=i;
                int y=0;
                toCenter(graphics, x, y);
            }
            for (int i = 0; i < 320; i+=20) {
                int x=i;
                int y=HEIGHT;
                toCenter(graphics, x, y);
            }*/

        //Solution No 2:
        for (int i = 0; i < 320; i += 20) {
            toCenter(graphics, 0, i);
            toCenter(graphics, WIDTH, i);
            toCenter(graphics, i, 0);
            toCenter(graphics, i, HEIGHT);
        }

    }

    public static void toCenter(Graphics graphics, int x, int y) {
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
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
