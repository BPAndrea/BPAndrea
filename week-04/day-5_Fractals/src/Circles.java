import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Circles {
  public static void mainDraw(Graphics graphics) {

    //NOT FINISHED!!

    int x = 0;
    int y = 0;
    int xEnd = WIDTH;
    int yEnd = WIDTH;
    drawCircles(graphics, x, y, xEnd, yEnd);
  }


  public static void drawCircles(Graphics graphics, int x, int y, int xEnd, int yEnd) {
    if (xEnd-x< 20) {
      graphics.drawOval(x, y, WIDTH, WIDTH);
      return;
    } else {
      x += WIDTH / 3;
      xEnd /= 3;
      yEnd /= 3;
      drawCircles(graphics, x, y, xEnd, yEnd);
    }
  }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main (String[]args){
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
