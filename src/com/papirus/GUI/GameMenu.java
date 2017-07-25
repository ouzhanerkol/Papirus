package com.papirus.GUI;

import com.papirus.Papirus;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Çağatay Uslu on 21.07.2017.
 */
public class GameMenu extends JWindow implements ActionListener {

    EmptyBorder windowBorder;
    Container contentPane, topPane, centerPane, bottomPane, infoContainer, bottomLeft, bottomRight;
    JLabel gameLogo;
    JButton playButton, infoButton, highScoreButton, optionsButton, quitButton;
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); // screen size

    public GameMenu() {

        contentPane = getContentPane();
        setSize(500, 500);
        setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setBackground(Color.BLACK);
        setLayout(new BorderLayout());

        topPane = new Container();
        topPane.setLayout(new BorderLayout(100, 100));
        contentPane.add(topPane, BorderLayout.NORTH);


        // Game logo
        gameLogo = new JLabel(Papirus.loadImage(Papirus.PAPIRUS_LOGO));
        gameLogo.setVerticalAlignment(SwingConstants.CENTER);


        // Exclamation and Options button container
        infoContainer = new Container();
        infoContainer.setLayout(new BorderLayout());
        topPane.add(infoContainer, BorderLayout.EAST);
        topPane.add(gameLogo, BorderLayout.SOUTH);

        // Exclamation button
        infoButton = new JButton(Papirus.loadImage(Papirus.INFO_LOGO_32));
        infoButton.setOpaque(false);
        infoButton.setContentAreaFilled(false);
        infoButton.setBorderPainted(false);
        infoButton.setMargin(new Insets(0, 0, 0, 0));
        infoButton.setVerticalAlignment(SwingConstants.TOP);
        infoContainer.add(infoButton, BorderLayout.WEST);


        // Quit button
        quitButton = new JButton(Papirus.loadImage(Papirus.CLOSE_LOGO_32));
        quitButton.setOpaque(false);
        quitButton.setContentAreaFilled(false);
        quitButton.setBorderPainted(false);
        quitButton.setMargin(new Insets(0, 0, 0, 0));
        quitButton.setVerticalAlignment(SwingConstants.TOP);
        quitButton.addActionListener(this);
        infoContainer.add(quitButton, BorderLayout.EAST);

        // content pane
        centerPane = new Container();
        centerPane.setLayout(new BorderLayout());
        contentPane.add(centerPane, BorderLayout.CENTER);

        // Play button
        playButton = new JButton(Papirus.loadImage(Papirus.PLAY_LOGO_128));
        playButton.setOpaque(false);
        playButton.setContentAreaFilled(false);
        playButton.setBorderPainted(false);
        playButton.setMargin(new Insets(0, 0, 0, 0));
        centerPane.add(playButton, BorderLayout.NORTH);


        // Botton pane
        bottomPane = new Container();
        bottomPane.setLayout(new BorderLayout());
        contentPane.add(bottomPane, BorderLayout.SOUTH);

        // HighScore button
        highScoreButton = new JButton(Papirus.loadImage(Papirus.CUP_LOGO_64));
        highScoreButton.setOpaque(false);
        highScoreButton.setContentAreaFilled(false);
        highScoreButton.setBorderPainted(false);
        highScoreButton.setMargin(new Insets(0, 0, 0, 0));
        bottomPane.add(highScoreButton, BorderLayout.WEST);

        // Options button
        optionsButton = new JButton(Papirus.loadImage(Papirus.OPTION_LOGO_64));
        optionsButton.setOpaque(false);
        optionsButton.setContentAreaFilled(false);
        optionsButton.setBorderPainted(false);
        optionsButton.setMargin(new Insets(0, 0, 0, 0));
        bottomPane.add(optionsButton, BorderLayout.EAST);

        // if we want to colored border for rootPane
        // windowBorder = new EmptyBorder(1, 1, 1, 1);
        // rootPane.setBorder(windowBorder);
    }

    public static void main(String[] args) {
        new GameMenu().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();

        if (source.equals(quitButton)){
            System.exit(0);
        }

        if(source.equals(playButton)){
            contentPane = new PlayPanel();
        }

    }
}
