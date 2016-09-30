package Game;

import Game.*;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by kunwar on 20-09-2016.
 */
public class GameOverState extends State {
    Stage1 stage1 = new Stage1();
    private int x = 0, t = 0, y = 0;
    public int b[] = {0, 0, 0};
    public Image[] image = {Resources.small0, Resources.small1, Resources.small2, Resources.small3, Resources.small4, Resources.small5, Resources.small6, Resources.small7, Resources.small8, Resources.small9};

    @Override
    public void update() {


    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Resources.bg, 0, 0, 288, 512, null);
        g.drawImage(Resources.start, 25, 380, 104, 58, null);
        g.drawImage(Resources.exit, 155, 380, 104, 58, null);
        g.drawImage(Resources.gameover, 25, 142, 236, 280, null);
        if (GamePanel.score >= 10 && GamePanel.score < 20)
            g.drawImage(Resources.silver, 59, 257, null);
        else if (GamePanel.score >= 20 && GamePanel.score < 30)
            g.drawImage(Resources.gold, 59, 257, null);
        else if (GamePanel.score >= 30)
            g.drawImage(Resources.platinum, 59, 257, null);

        if (Stage1.k == 1){
            g.drawImage(Resources.high, 148, 271, null);
        }
        x = 204;
        this.scoreGenerator();
        for (int l = t - 1; l >= 0; l--) {
            g.drawImage(image[b[l]], x, 245, null);
            x = x + 14;
        }
        x = 204;
        this.highScoreGenerator();
        for (int l = t - 1; l >= 0; l--) {
            g.drawImage(image[b[l]], x, 286, null);
            x = x + 14;
        }
    }

    @Override
    public void keyPressed(int keyCode) {
        if (keyCode == KeyEvent.VK_ENTER) {
            Stage1.k=0;
            GamePanel.score = 0;
            GamePanel.stop = 0;
            GamePanel.check=1;
            GamePanel.currentState = new Stage1();
        }
    }

    @Override
    public void keyReleased(int keyCode) {

    }

    @Override
    public void mouseClicked(int x, int y) {
        if ((x > 25 && x < 129) && (y < 438 && y > 380)) {
            GamePanel.check=1;
            Stage1.k=0;
            GamePanel.score = 0;
            GamePanel.stop = 0;
            GamePanel.currentState = new Stage1();

        }
        if ((x > 155 && x < 259) && (y < 438 && y > 380))
            System.exit(0);


    }

    @Override
    public void mouseReleased(int x, int y) {

    }

    private void scoreGenerator() {
        this.t = 0;
        this.y = 200;
        int i = GamePanel.score;
        while (i > 0) {
            b[t] = i % 10;
            i = i / 10;
            this.t++;
        }

    }

    private void highScoreGenerator() {
        DatabaseThread databaseThread = new DatabaseThread();
        int j = databaseThread.gethighscore();
        this.t = 0;
        this.y = 100;
        int i = j;
        while (i > 0) {
            b[t] = i % 10;
            i = i / 10;
            this.t++;
        }
    }
}
