package com.papirus;


import javax.swing.*;

/**
 * Created by Çağatay Uslu on 21.07.2017.
 */
public class Papirus {

    public static String EXIT_ICON = "",
            PAPIRUS_LOGO = "assets/images/papirus_logo.png",
            PLAY_LOGO_64 = "assets/images/play_black-64x64.png",
            INFO_LOGO_64 = "assets/images/exclamation_black-64x64.png",
            OPTION_LOGO_64 = "assets/images/options_black-64x64.png";

    public Papirus() {
    }


    // load image
    public static ImageIcon loadImage(String loc) {
        return new ImageIcon(Papirus.class.getResource(loc));
    }

    public static void main(String[] args) {

    }
}
