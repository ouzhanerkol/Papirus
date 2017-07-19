

package com.papirus;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Çağatay Uslu on 20.07.2017.
 */
public class About extends JPanel { // extends deyince JPanel About'un superclass'ı üst sınıfı olur
    // About JPanel'e ait methodları kullanabilir anlamı taşır bu

    private JLabel label; // bir tane JLabel nesnesi tanımladık ismi label, henüz yaratmadık

    public About() { // About sınıfından oluşturulan her objenin özelliklerini buraya girebilirsin
        // bu About'ın argümansız yapıcısı (no-arg constructor) ı oluyor.
        // argümanlı da olabilir ona sonra gelicez

        label = new JLabel("Oğuzhan Erkol"); // JLabel'dan label isminde nesneyi yarattık içine ismini yazdık
        add(label); // yarattığımız label nesnesini ekledik. aa
    }
}
