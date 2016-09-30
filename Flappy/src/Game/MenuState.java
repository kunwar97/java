package Game;

import Game.GamePanel;
import Game.Resources;
import Game.Stage1;
import Game.State;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 * Created by kunwar on 19-09-2016.
 */
public class MenuState extends State {
    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Resources.bg,0,0,288,512,null);
        g.drawImage(Resources.flappy,144-96,50,null);
        g.drawImage(Resources.bird1,144-17,140,null);
        g.drawImage(Resources.start,144-52, GamePanel.GAME_HEIGHT/2,104,58,null);



    }

    @Override
    public void keyPressed(int keyCode) {
        if (keyCode== KeyEvent.VK_ENTER){
            GamePanel.currentState=new Stage1();
        }



    }

    @Override
    public void keyReleased(int keyCode) {

    }

    @Override
    public void mouseClicked(int x,int y) {
        System.out.println("mouse clicked");
        if (x>95&&x<199&&y<314&&y>256)
            GamePanel.currentState=new Stage1();
    }

    @Override
    public void mouseReleased(int x, int y) {

    }

}
