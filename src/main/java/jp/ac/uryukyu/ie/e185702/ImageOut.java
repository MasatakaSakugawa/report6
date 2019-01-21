package jp.ac.uryukyu.ie.e185702;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class ImageOut extends Applet {
    Image image;

    public void init() {
        image = getImage(getClass().getResource("Aotyan.png"));
    }

    public void paint(Graphics g){
        g.drawImage(image, 10, 10, this);
    }
}
