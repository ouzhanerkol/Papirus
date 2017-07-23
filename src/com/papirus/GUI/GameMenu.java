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
    Container contenPane, topPane, centerPane, bottomPane, infoContainer;
    JLabel gameLogo;
    JButton playButton, infoButton, optionsButton , highScoreLogo, quitLogo;
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); // screen size

    public GameMenu() {

        contenPane = getContentPane();
        setSize(500,500);
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setBackground(Color.BLACK);
        setLayout(new BorderLayout());

        topPane = new Container();
        topPane.setLayout(new BorderLayout(100,100));
        contenPane.add(topPane, BorderLayout.NORTH);


        // Game logo
        gameLogo = new JLabel(Papirus.loadImage(Papirus.PAPIRUS_LOGO));
        gameLogo.setVerticalAlignment(SwingConstants.CENTER);
        //gameLogo.setOpaque(true); // TODO 1


        // Exclamation and Options button container
        infoContainer = new Container();
        infoContainer.setLayout(new BorderLayout());
        topPane.add(infoContainer, BorderLayout.EAST);
        topPane.add(gameLogo, BorderLayout.SOUTH);

        // Exclamation button
        infoButton = new JButton(Papirus.loadImage(Papirus.INFO_LOGO_24));
        infoButton.setOpaque(false);
        infoButton.setContentAreaFilled(false);
        infoButton.setBorderPainted(false);
        infoButton.setMargin(new Insets(0,0,0,0));
        infoButton.setVerticalAlignment(SwingConstants.TOP);
        infoContainer.add(infoButton, BorderLayout.WEST);


        // Options button
        optionsButton = new JButton(Papirus.loadImage(Papirus.OPTION_LOGO_24));
        optionsButton.setOpaque(false);
        optionsButton.setContentAreaFilled(false);
        optionsButton.setBorderPainted(false);
        optionsButton.setMargin(new Insets(0,0,0,0));
        optionsButton.setVerticalAlignment(SwingConstants.TOP);
        infoContainer.add(optionsButton, BorderLayout.EAST);

        centerPane = new Container();
        centerPane.setLayout(new BorderLayout());
        contenPane.add(centerPane, BorderLayout.CENTER);

        // Play button
        playButton = new JButton(Papirus.loadImage(Papirus.PLAY_LOGO_64));
        playButton.setOpaque(false);
        playButton.setContentAreaFilled(false);
        playButton.setBorderPainted(false);
        playButton.setMargin(new Insets(0,0,0,0));
        centerPane.add(playButton, BorderLayout.NORTH);


        bottomPane = new Container();
        bottomPane.setLayout(new BorderLayout());
        contenPane.add(bottomPane, BorderLayout.SOUTH);


        windowBorder = new EmptyBorder(1,1,1,1);
        rootPane.setBorder(windowBorder);
    }

    public static void main(String[] args){
        new GameMenu().setVisible(true);
    }
}
