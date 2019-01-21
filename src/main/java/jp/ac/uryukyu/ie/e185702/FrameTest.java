package jp.ac.uryukyu.ie.e185702;
import java.awt.*;

public class FrameTest extends Frame {
    public static void main(String [] args) {
        new FrameTest();
    }
    FrameTest() {
        super("FrameTest");
        setSize(200, 100);
        //setSizeで表示されるフレームの大きさを調節します。widthが横幅、heightが縦の幅です
        show();
        //show()でsetSize()で指定した大きさのフレームを表示します。
    }
}