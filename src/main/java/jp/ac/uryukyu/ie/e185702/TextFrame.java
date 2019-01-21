package jp.ac.uryukyu.ie.e185702;
import javax.swing.*;
import java.awt.*;

public class TextFrame{
    public static void main(String[] args) {

        //フレーム表示
        JFrame f = new JFrame("テキストフィールド");

        //コンテンツ区画の取得
        Container cont =  f.getContentPane();

        //テキストフィールドの作成""の中に表示させたい文字を入れる
        JTextField jt = new JTextField("あああああああああああ");

        //テキストフィールドをコンテンツ区画に追加する
        cont.add(jt);

        //文字フレームのサイズを指定
        f.setSize(400, 400);

        //フレームの表示・非表示を指定
        f.setVisible(true);

        //×を押した時に閉じる関数
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}