import com.papirus.About;

import javax.swing.*;
import java.awt.*;

public class mainFrame {
    public static void main(String[] args){

        JFrame mainFrame = new JFrame("Papirus"); // pencere yarattık ismi mainFrame, title Papirus

        Container contentPane = new Container(); // yarattığımız pencerenin içerik kısmı için bir konteyner yarattık
        contentPane = mainFrame.getContentPane(); // bu konteynera "Bu konteynır pencerenin içeriğidir!" dedik

        About about = new About(); // kedin oluşturduğumu About.java sınıfında bir obje yarattık

        contentPane.add(about); // bu objeyi içeriğe ekledik

        mainFrame.setVisible(true); // pencereye görünür özelliği verdik
    }
    }
}
