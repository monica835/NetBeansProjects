package color;

/**
 *
 * @author 2ndyrGroupB
 */
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class Floewer {

    BufferedImage image;
    int width;
    int height;

    public Floewer() {

        try {
            File input = new File("C:\\Users\\dinglasamo_sd2082\\Monica/flower.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();

            for (int i = 0; i < height; i++) {

                for (int j = 0; j < width; j++) {

                    Color c = new Color(image.getRGB(j, i));

                    Color black = new Color(0, 0, 0);
                    Color mon = new Color(255, 255, 255);
                    int white = 50;

                    if (c.getRGB() == black.getRGB() || (c.getBlue() < white && c.getGreen() < white && c.getRed() < white)) {

                    } else {
                        image.setRGB(j, i, mon.getRGB());
                    }

                }
            }

            File ouptut = new File("C:\\Users\\dinglasamo_sd2082\\Monica/flower2.jpg");
            ImageIO.write(image, "jpg", ouptut);

        } catch (Exception e) {
        }
    }

    static public void main(String args[]) throws Exception {
        Floewer obj = new Floewer();
    }
}
