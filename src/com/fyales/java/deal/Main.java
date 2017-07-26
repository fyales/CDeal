package com.fyales.java.deal;

import java.io.File;
import java.io.IOException;

/**
 * Created by fyales on 26/07/2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("origin_pic");
        if (file.exists()) {
            for (File f : file.listFiles()) {
                if (PicUtil.isPIC(f)){
                    ImageDealer.dealPic(f);
                }
            }
        }
    }


}
