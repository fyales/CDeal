package com.fyales.java.deal;

import java.io.File;

/**
 * Created by fyales on 26/07/2017.
 */
public class PicUtil {

    public static boolean isPIC(File file){
        return isJPG(file) || isPNG(file);
    }


    public static boolean isJPG(File file){
        String[] splitFile = file.getName().split("\\.");

        if (splitFile.length > 1) {
            String suffix = splitFile[splitFile.length - 1].toLowerCase();

            if (suffix.equals("jpg") || suffix.equals("jpeg")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isPNG(File file){
        String[] splitFile = file.getName().split("\\.");

        if (splitFile.length > 1) {
            String suffix = splitFile[splitFile.length - 1].toLowerCase();
            if (suffix.equals("png")) {
                return true;
            }
            return false;
        }
        return false;
    }
}
