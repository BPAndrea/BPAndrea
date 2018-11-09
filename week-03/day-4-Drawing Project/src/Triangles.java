import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        int sidelength=15;
        int x1=WIDTH/2;
        int y1=40;
        int numberOfRow= 16;
        for (int i =1; i <=numberOfRow ; i++) {
            for (int j =1; j <= i; j++) {
                graphics.drawLine(x1, y1, x1 + sidelength, y1);
                graphics.drawLine(x1, y1, x1 + (sidelength / 2), y1 - sidelength);
                graphics.drawLine(x1 + sidelength, y1, x1 + (sidelength / 2), y1 - sidelength);
                x1 += sidelength;
            }
            x1=WIDTH/2;
            x1= x1- i*(sidelength / 2);
            y1 += sidelength;
        }


        //g2d.draw(new Line2D.Double(50,150,150,150 ));
        //g2d.draw(new Line2D.Double(50,50,150,150 ));
        //g2d.draw(new Line2D.Double(50,50,50,150 ));
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
