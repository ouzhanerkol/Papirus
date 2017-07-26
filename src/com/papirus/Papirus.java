package com.papirus;


import javax.swing.*;

/**
 * Created by Çağatay Uslu on 21.07.2017.
 */
public class Papirus {

    public static String EXIT_ICON = "",
            PAPIRUS_LOGO = "assets/images/papirus.png",
            PLAY_LOGO_64 = "assets/images/play-64x64.png",
            PLAY_LOGO_128 = "assets/images/play-128x128.png",
            PLAY_LOGO_256 = "assets/images/play-256x256.png",
            CUP_LOGO_64 = "assets/images/cup-64x64.png",
            CUP_LOGO_128 = "assets/images/cup-128x128.png",
            INFO_LOGO_24 = "assets/images/info-24x24.png",
            INFO_LOGO_32 = "assets/images/info-32x32.png",
            OPTION_LOGO_24 = "assets/images/options-24x24.png",
            OPTION_LOGO_32 = "assets/images/options-32x32.png",
            OPTION_LOGO_64 = "assets/images/options-64x64.png",
            OPTION_LOGO_128 = "assets/images/options-128x128.png",
            CLOSE_LOGO_24 = "assets/images/close-24x24.png",
            CLOSE_LOGO_32 = "assets/images/close-32x32.png",
            CLOSE_LOGO_64 = "assets/images/close-64x64.png",
            CLOSE_LOGO_128 = "assets/images/close-128x128.png",
            BACKGROUND_ANIMATION = "assets/animated/giphy.gif";

    public Papirus() {
    }


    // load image
    public static ImageIcon loadImage(String loc) {
        return new ImageIcon(Papirus.class.getResource(loc));
    }

    public static void main(String[] args) {

    }
}
