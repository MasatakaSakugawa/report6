package jp.ac.uryukyu.ie.e185702;

import java.applet.*;
import java.net.*;

public class Voice{

    private URL url;
    private AudioClip audioClip;

    public Voice(String fileName) {
        fileLoad(fileName);
    }


    public void fileLoad(String fileName) {

        try {
            url = new URL("file:" +
                    System.getProperty("user.dir") + "/" + fileName);
        }

        catch (MalformedURLException ex) {
            System.err.println(ex);
        }

        //AudioClipの生成
        audioClip = Applet.newAudioClip(url);
    }

    //再生する
    public void play() {
        audioClip.play();
    }

    //停止する
    public void stop() {
        audioClip.stop();
    }

    public static void main(String[] args) {
        Voice test = new Voice("line-girl1_line-girl1-ohayougozaimasu1.wav");
        test.play();
    }
}