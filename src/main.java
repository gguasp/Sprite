import helper.Sprite;


import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class main {

    static BufferedImage image;

    public static void main(String args[])
    {
        Sprite nave = new Sprite("img/ship/shipsheet.png", 50, 50);
        image = nave.getSprite(1,0);

        Frame frame = new Frame();

        frame.add(new CustomPaintComponent());

        int frameWidth = 300;

        int frameHeight = 300;

        frame.setSize(frameWidth, frameHeight);

        frame.setVisible(true);

    }

    /**
     * To draw on the screen, it is first necessary to subclass a Component 
     * and override its paint() method. The paint() method is automatically called 
     * by the windowing system whenever component's area needs to be repainted.
     */
    static class CustomPaintComponent extends Component {

        public void paint(Graphics g) {

            // Retrieve the graphics context; this object is used to paint shapes

            Graphics2D g2d = (Graphics2D) g;
            g2d.drawImage(image, 50, 50, this);

        }

    }
}
