package com.fyales.java.deal;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * <p>处理原则</p>
 * Created by fyales on 26/07/2017.
 */
public class ImageDealer {

    public static void dealPic(File file) throws IOException {

        BufferedImage image = ImgPress.compress(file);
        File destFile = new File("processed_pic" + File.separator + System.currentTimeMillis() + ".jpg");
        FileOutputStream out = new FileOutputStream(destFile);
        JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
        encoder.encode(image);
        out.close();

    }

}
