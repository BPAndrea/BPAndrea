import javax.swing.*;
import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

import static java.lang.Math.PI;

public class Hexagon {
    public static void mainDraw(Graphics graphics) {
        int posX = 50;
        int posY = 100;
        int r = 20;

        for (int i = 4; i <7 ; i++){
            for (int j = 0; j <i; j++) {
                drawPoligon(graphics, posX, posY, r);
                posY += (int) (Math.sqrt(3) * r);
            }
            posX+=(int)(1.5*r);
            posY=100;
            posY-=(int)(Math.sqrt(3) * r);

        }


    }

    public static void drawPoligon(Graphics graphics, int posX, int posY, int r) {
        Polygon hex = new Polygon();
        graphics.setColor(Color.RED);
        for (int i = 0; i < 6; i++) {
            hex.addPoint((int) (posX + (r * Math.cos(i * 2 * Math.PI / 6))),
                    (int) (posY + (r * Math.sin(i * 2 * Math.PI / 6))));
        }
        graphics.drawPolygon(hex);

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

