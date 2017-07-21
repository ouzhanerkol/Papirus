package com.papirus.GUI;

import com.papirus.Papirus;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Created by Çağatay Uslu on 21.07.2017.
 */
public class GameMenu extends JWindow {

    EmptyBorder windowBorder;
    Container contenPane, topPane, centerPane, bottomPane;
    JLabel gameLogo, playLogo, highScoreLogo, quitLogo;
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); // screen size

    public GameMenu() {


        contenPane = getContentPane();
        setSize(500,500);
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setLayout(new BorderLayout());

        topPane = new Container();
        topPane.setLayout(new BorderLayout(100,100));
        contenPane.add(topPane, BorderLayout.NORTH);

        gameLogo = new JLabel(Papirus.loadImage(Papirus.PLAY_LOGO_64));
        gameLogo.setOpaque(false); // TODO 1
        topPane.add(gameLogo, BorderLayout.CENTER);

        centerPane = new Container();
        centerPane.setLayout(new BorderLayout());
        contenPane.add(centerPane, BorderLayout.CENTER);

        playLogo = new JLabel(Papirus.loadImage(Papirus.PLAY_LOGO_64));
        playLogo.setOpaque(false);
        centerPane.add(playLogo, BorderLayout.CENTER);

        bottomPane = new Container();
        bottomPane.setLayout(new BorderLayout());
        contenPane.add(bottomPane, BorderLayout.SOUTH);

        windowBorder = new EmptyBorder(30,30,30,30);
        rootPane.set
        rootPane.setBorder(windowBorder);
    }

    public static void main(String[] args){
        new GameMenu().setVisible(true);
    }
}
