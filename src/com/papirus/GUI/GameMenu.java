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
        setBackground(Color.green);
        setLayout(new BorderLayout());

        topPane = new Container();
        topPane.setLayout(new BorderLayout(100,100));
        contenPane.add(topPane, BorderLayout.NORTH);
        contenPane.setBackground(Color.CYAN);


<<<<<<< Updated upstream
        // Game logo
        gameLogo = new JLabel(Papirus.loadImage(Papirus.PAPIRUS_LOGO));
=======
        contenPane.setBackground(Color.green);

        gameLogo = new JLabel(Papirus.loadImage(Papirus.PAPIRUS_LOGO));
        //gameLogo.setOpaque(true); // TODO 1
>>>>>>> Stashed changes
        topPane.add(gameLogo, BorderLayout.CENTER);

        // Exclamation and Options button container
        infoContainer = new Container();
        infoContainer.setLayout(new BorderLayout());
        topPane.add(infoContainer, BorderLayout.EAST);

        // Exclamation button
        infoButton = new JButton(Papirus.loadImage(Papirus.INFO_LOGO_64));
        infoContainer.add(infoButton, BorderLayout.WEST);

        // Options button
        optionsButton = new JButton(Papirus.loadImage(Papirus.OPTION_LOGO_64));
        infoContainer.add(optionsButton, BorderLayout.EAST);

        centerPane = new Container();
        centerPane.setLayout(new BorderLayout());
        contenPane.add(centerPane, BorderLayout.CENTER);

<<<<<<< Updated upstream

        // Play button

        playButton = new JButton(Papirus.loadImage(Papirus.PLAY_LOGO_64));
        playButton.setOpaque(false);
        centerPane.add(playButton, BorderLayout.CENTER);
=======
        playLogo = new JLabel(Papirus.loadImage(Papirus.OPTIONS_LOGO_64));
        playLogo.setOpaque(false);
        centerPane.add(playLogo, BorderLayout.CENTER);
>>>>>>> Stashed changes

        bottomPane = new Container();
        bottomPane.setLayout(new BorderLayout());
        contenPane.add(bottomPane, BorderLayout.SOUTH);
        JButton quit = new JButton("Quit oç");
        bottomPane.add(quit);

        windowBorder = new EmptyBorder(30,30,30,30);
        rootPane.setBorder(windowBorder);
    }

    public static void main(String[] args){
        new GameMenu().setVisible(true);
    }
}
