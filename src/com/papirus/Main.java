package com.papirus;
/**
 * Created by Çağatay Uslu on 26.07.2017.
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.add(new ImagePanel());

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 400);
                frame.setVisible(true);
            }
        });
    }
}

class ImagePanel extends JPanel {

    private Image image;

    public ImagePanel() {
        image = Toolkit.getDefaultToolkit().createImage("");
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, this);
        }
    }

}