package com.papirus.GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Çağatay Uslu on 25.07.2017.
 */
public class Square extends JButton {

    private Color color;
    private Dimension width, height;
    private int number;
    private static Insets noInsets;
    private Font font;

    static{
        noInsets = new Insets(0, 0, 0, 0);
    }

    public Square(){
        setMargin(noInsets);
    }

    public void setRandomColor(Color color){
        // TODO set randomize
        this.color = color;
    }

    public void setRandomNumber(int number){
        // TODO set randomize
        this.number = number;
    }
}
