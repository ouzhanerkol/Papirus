package com.papirus;


import javax.swing.*;

/**
 * Created by Çağatay Uslu on 21.07.2017.
 */
public class Papirus {

    public static String EXIT_ICON = "",
            PAPIRUS_LOGO = "assets/images/papirus_logo.png",
            PLAY_LOGO_64 = "assets/images/play_black-64x64.png",
            INFO_LOGO_24 = "assets/images/exclamation-24x24.png",
            INFO_LOGO_32 = "assets/images/exclamation-32x32.png",
            OPTION_LOGO_24 = "assets/images/options-24x24.png",
            OPTION_LOGO_32 = "assets/images/options-32x32.png";

    public Papirus() {
    }


    // load image
    public static ImageIcon loadImage(String loc) {
        return new ImageIcon(Papirus.class.getResource(loc));
    }

    public static void main(String[] args) {

    }
}
