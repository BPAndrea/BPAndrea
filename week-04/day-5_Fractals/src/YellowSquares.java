import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Sierpinsky {
  public static void mainDraw(Graphics graphics) {

    carpet2(graphics, 0,0, WIDTH);
  }


  public static void carpet(Graphics graphics, int x, int y, int width){
    graphics.drawRect(x+width/3,y, width/3, width/3);
    graphics.drawRect(x,y+width/3, width/3, width/3);
    graphics.drawRect(x+width/3,y+width*2/3, width/3, width/3);
    graphics.drawRect(x+width*2/3, y+width/3, width/3, width/3);


  }

  public static void carpet2(Graphics graphics, int x, int y, int width){
    carpet(graphics,x,y,width);
    if (width>20) {
      carpet2(graphics, x + width/3, y, width/3);
      carpet2(graphics, x, y + width/3, width/3);
      carpet2(graphics, x + width / 3, y + width * 2 / 3, width / 3);
      carpet2(graphics, x + width * 2 / 3, y + width / 3, width / 3);
    }

  }
  // Don't touch the code below
  static int WIDTH = 729;
  static int HEIGHT = 729;

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
      this.setBackground(Color.YELLOW);
    }
  }
}

