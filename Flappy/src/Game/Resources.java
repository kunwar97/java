package Game;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;

/**
 * Created by kunwar on 19-09-2016.
 */
public class Resources {
    public static Image bird1;
    public static Image bird2;
    public static Image bird3;
    public static Image bg;
    public static Image ground;
    public static Image toptube;
    public static Image bottomtube;
    public static Image gameover;
    public static Image start;
    public static Image getReady;
    public static Image big0;
    public static Image big1;
    public static Image big2;
    public static Image big3;
    public static Image big4;
    public static Image big5;
    public static Image big6;
    public static Image big7;
    public static Image big8;
    public static Image big9;
    public static Image small0;
    public static Image small1;
    public static Image small2;
    public static Image small3;
    public static Image small4;
    public static Image small5;
    public static Image small6;
    public static Image small7;
    public static Image small8;
    public static Image small9;
    public static Image exit;
    public static Image flappy;
    public static Image platinum;
    public static Image silver;
    public static Image gold;
    public static Image high;
    public static AudioClip jumpSound;
    public static AudioClip music;
    public static AudioClip hit;

    public static void load() {
        try {
            Resources.bg = ImageIO.read(Resources.class.getResource("/images/bg.png"));
            Resources.bird1 = ImageIO.read(Resources.class.getResource("/images/bird1.png"));
            Resources.bird2 = ImageIO.read(Resources.class.getResource("/images/bird2.png"));
            Resources.bird3 = ImageIO.read(Resources.class.getResource("/images/bird3.png"));
            Resources.ground = ImageIO.read(Resources.class.getResource("/images/ground.png"));
            Resources.toptube = ImageIO.read(Resources.class.getResource("/images/toptube.png"));
            Resources.bottomtube = ImageIO.read(Resources.class.getResource("/images/bottomtube.png"));
            Resources.gameover = ImageIO.read(Resources.class.getResource("/images/scoreboard.png"));
            Resources.start = ImageIO.read(Resources.class.getResource("/images/playbtn.png"));
            Resources.exit = ImageIO.read(Resources.class.getResource("/images/exit.PNG"));
            Resources.getReady = ImageIO.read(Resources.class.getResource("/images/splash.png"));
            Resources.jumpSound= Applet.newAudioClip(Resources.class.getResource("/sounds/jump.wav"));
            Resources.music= Applet.newAudioClip(Resources.class.getResource("/sounds/music.wav"));
            Resources.hit= Applet.newAudioClip(Resources.class.getResource("/sounds/sfx_hit.wav"));
            Resources.flappy = ImageIO.read(Resources.class.getResource("/images/flappy.png"));
            Resources.big0 = ImageIO.read(Resources.class.getResource("/scoreimages/font_big_0.png"));
            Resources.big1 = ImageIO.read(Resources.class.getResource("/scoreimages/font_big_1.png"));
            Resources.big2 = ImageIO.read(Resources.class.getResource("/scoreimages/font_big_2.png"));
            Resources.big3 = ImageIO.read(Resources.class.getResource("/scoreimages/font_big_3.png"));
            Resources.big4 = ImageIO.read(Resources.class.getResource("/scoreimages/font_big_4.png"));
            Resources.big5 = ImageIO.read(Resources.class.getResource("/scoreimages/font_big_5.png"));
            Resources.big6 = ImageIO.read(Resources.class.getResource("/scoreimages/font_big_6.png"));
            Resources.big7 = ImageIO.read(Resources.class.getResource("/scoreimages/font_big_7.png"));
            Resources.big8 = ImageIO.read(Resources.class.getResource("/scoreimages/font_big_8.png"));
            Resources.big9 = ImageIO.read(Resources.class.getResource("/scoreimages/font_big_9.png"));
            Resources.small0 = ImageIO.read(Resources.class.getResource("/scoreimages/font_small_0.png"));
            Resources.small1 = ImageIO.read(Resources.class.getResource("/scoreimages/font_small_1.png"));
            Resources.small2 = ImageIO.read(Resources.class.getResource("/scoreimages/font_small_2.png"));
            Resources.small3 = ImageIO.read(Resources.class.getResource("/scoreimages/font_small_3.png"));
            Resources.small4 = ImageIO.read(Resources.class.getResource("/scoreimages/font_small_4.png"));
            Resources.small5 = ImageIO.read(Resources.class.getResource("/scoreimages/font_small_5.png"));
            Resources.small6 = ImageIO.read(Resources.class.getResource("/scoreimages/font_small_6.png"));
            Resources.small7 = ImageIO.read(Resources.class.getResource("/scoreimages/font_small_7.png"));
            Resources.small8 = ImageIO.read(Resources.class.getResource("/scoreimages/font_small_8.png"));
            Resources.small9 = ImageIO.read(Resources.class.getResource("/scoreimages/font_small_9.png"));
            Resources.platinum = ImageIO.read(Resources.class.getResource("/images/medal_platinum.png"));
            Resources.gold = ImageIO.read(Resources.class.getResource("/images/medal_gold.png"));
            Resources.silver = ImageIO.read(Resources.class.getResource("/images/medal_silver.png"));
            Resources.high = ImageIO.read(Resources.class.getResource("/images/new.png"));




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
