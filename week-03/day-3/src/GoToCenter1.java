
import javax.swing.*;
import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

    public class GoToCenter1 {
        public static void mainDraw(Graphics graphics) {
            // Create a line drawing function that takes 2 parameters:
            // The x and y coordinates of the line's starting point
            // and draws a line from that point to the center of the canvas.
            // Draw 3 lines with that function. Use loop for that.
            /*      for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please give me the value of x and y: ");
            int xValue = scanner.nextInt();
            int yValue = scanner.nextInt();
             }*/

            int[] xValue = {0, 50, 100};
            int[] yValue = {0, 300, 250};
            goToCenter(graphics, xValue, yValue);
        }

        public static void goToCenter(Graphics graphics, int[] x, int[] y) {
            for (int i = 0; i < 3; i++) {
                int xValue = x[i];
                int yValue = y[i];
                graphics.drawLine(xValue, yValue, WIDTH / 2, HEIGHT / 2);
                //graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
            }
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

