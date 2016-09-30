package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

/**
 * Created by kunwar on 19-09-2016.
 */
public class GamePanel extends JPanel implements KeyListener, Runnable ,MouseListener{
    public static final int GAME_WIDTH = 288;
    public static final int GAME_HEIGHT = 512;
    public static State currentState;
    public static int score=0;
    public static int stop=0,check=1;
    public int count=0;

    public GamePanel() {
        super();

        this.setFocusable(true);
        this.setPreferredSize(new Dimension(GAME_WIDTH, GAME_HEIGHT));
        this.addKeyListener(this);
    }

    @Override
    public void addNotify() {
        super.addNotify();
        this.addMouseListener(this);

        this.requestFocus();
        Resources.load();
      //  Resources.music.loop();


        GamePanel.currentState = new MenuState();

        Thread gameThread = new Thread(this);
        gameThread.setName("Game Thread");
        gameThread.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        GamePanel.currentState.keyPressed(e.getKeyCode());

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        Image mainImage = new BufferedImage(GAME_WIDTH, GAME_HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics imageGraphics;
        Graphics panelGraphics;

        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (check==0){
            if (stop==0){
            if (count%10==0){
                score++;
                count=0;
            }}}

            GamePanel.currentState.update();

            imageGraphics = mainImage.getGraphics();
            imageGraphics.clearRect(0, 0, GAME_WIDTH, GAME_HEIGHT);
            GamePanel.currentState.render(imageGraphics);

            imageGraphics.dispose();

            panelGraphics = this.getGraphics();
            panelGraphics.drawImage(mainImage, 0, 0, null);
            panelGraphics.dispose();
            count++;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        GamePanel.currentState.mouseClicked(e.getX(),e.getY());
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
}

