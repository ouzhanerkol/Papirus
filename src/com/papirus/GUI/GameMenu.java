package com.papirus.GUI;

import com.papirus.Papirus;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.File;

/**
 * Created by Çağatay Uslu on 21.07.2017.
 */
public class GameMenu extends JWindow implements ActionListener, MouseListener{

    EmptyBorder windowBorder;
    Container contentPane, topPane, centerPane, bottomPane, infoContainer, bottomLeft, bottomRight;
    JLabel gameLogo;
    JButton playButton, infoButton, highScoreButton, optionsButton, quitButton;
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); // screen size


    public GameMenu() throws MalformedURLException {
        URL url = new URL("https://raw.githubusercontent.com/ouzhanerkol/Papirus/master/src/com/papirus/assets/animated/giphy.gif");
        Image image = new ImageIcon(url).getImage();

        playSound(Papirus.PLAY_SOUND);

        ImagePanel imagePanel = new ImagePanel(image);
        setContentPane(imagePanel);
        imagePanel.setLayout(new BorderLayout());
        setSize(500, 500);
        setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        topPane = new Container();
        topPane.setLayout(new BorderLayout(100, 100));
        imagePanel.add(topPane, BorderLayout.NORTH);


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
        imagePanel.add(centerPane, BorderLayout.CENTER);

        // Play button
        playButton = new JButton(Papirus.loadImage(Papirus.PLAY_LOGO_128));
        playButton.setOpaque(false);
        playButton.setContentAreaFilled(false);
        playButton.setBorderPainted(false);
        playButton.setMargin(new Insets(0, 0, 0, 0));
        playButton.addActionListener(this);
        playButton.addMouseListener(this);
        centerPane.add(playButton, BorderLayout.NORTH);


        // Botton pane
        bottomPane = new Container();
        bottomPane.setLayout(new BorderLayout());
        imagePanel.add(bottomPane, BorderLayout.SOUTH);

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

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    static class ImagePanel extends JPanel {

        private Image image;

        ImagePanel(Image image) {
            this.image = image;
        }
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public void playSound(String soundName)
    {
        try
        {
            AudioInputStream ais = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
            clip.loop(clip.LOOP_CONTINUOUSLY);
        }
        catch(Exception ex)
        {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();

        if (source.equals(playButton)) {
            PlayPanel p = new PlayPanel();
            p.setVisible(true);
        }

        if (source.equals(quitButton)) {
            playSound(Papirus.EXIT_SOUND);
            System.exit(0);
        }


    }
}
