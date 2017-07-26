package com.fyales.java.deal;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by fyales on 26/07/2017.
 */
public class ImgPress {

    public static BufferedImage compress(File file) throws IOException {

        BufferedImage image = ImageIO.read(file);
        int width = image.getWidth(null);
        int height = image.getHeight(null);

        if (width < 1920) {
            return image;
        } else {
            //宽度大于1080像素，开始进行压缩
            int processedWith = 1920;
            int processedHeight = height * 1920 / width;
            return resize(image,processedWith,processedHeight);
        }
    }

    public static BufferedImage resize(Image originImage, int width, int height) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        image.getGraphics().drawImage(originImage, 0, 0, width, height, null);
        return image;
    }
}
