package Game;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;

/**
 * Created by kunwar on 19-09-2016.
 */
public class Stage1 extends State {
    public int birdX = 127;
    public int birdY = 272;
    public int bg1L = 0;
    public int bg2L = 240;
    public int ground1L = 0;
    public int ground1R = 336;
    public int ground2L = 330;
    public int ground2R = 666;
    public int flag = 0;
    public static int up=0;
   // public  int score=37;
    public static int j=0;
    public static int k=0;
    public Image[] image={Resources.big0,Resources.big1,Resources.big2,Resources.big3,Resources.big4,Resources.big5,Resources.big6,Resources.big7,Resources.big8,Resources.big9};
    public int a[]={0,0,0};
    public int x=0;
    public  int t=0;
    public  int i=0;



    java.util.List<Pipes> pipes;
    java.util.List<PipeBottom> pipes1;
    java.util.List<Entity> entities;
    Bird bird;

    public Stage1() {
        this.entities = new ArrayList<>();
        this.pipes = new ArrayList<>();
        this.pipes1 = new ArrayList<>();
//       this.pipes.add(new Pipes(288));
//        this.pipes1.add(new PipeBottom(576));
//        this.pipes1.add(new PipeBottom(288));
//       this.pipes.add(new Pipes(576));

        this.entities.add(new Pipes(288));
        this.entities.add(new PipeBottom(288));
        this.entities.add(new Pipes(488));
        this.entities.add(new PipeBottom(488));
        this.bird = new Bird(birdX, birdY);
        this.entities.add(this.bird);



    }

    @Override
    public void update() {


        this.scoreGenerator();

        if (flag == 1) {

            for (int i = 0; i < this.entities.size(); i++) {
                this.entities.get(i).update();

            }
            for (int i = 0; i < this.entities.size()-1 ; i++) {

                if (bird.isColliding(entities.get(i))) {
                    Resources.hit.play();
                    GamePanel.stop=1;
                    DatabaseThread databaseThread=new DatabaseThread();
                    j=databaseThread.gethighscore();
                    databaseThread.submitscore(GamePanel.score);
                    if (GamePanel.score>=j){
                        k=1;}
                    GamePanel.currentState = new GameOverState();
                }


            }


            ground1L -= 5;
            ground1R -= 5;
            ground2L -= 5;
            ground2R -= 5;
        }

        if (ground1R < -5) {
            ground1L = 290;
            ground1R = 616;
        }
        if (ground2R < -5) {
            ground2L = 290;
            ground2R = 616;
        }
        if (bird.y > 390 || bird.y < -10) {
            Resources.hit.play();
            GamePanel.check=1;
            DatabaseThread databaseThread=new DatabaseThread();
            j=databaseThread.gethighscore();
            databaseThread.submitscore(GamePanel.score);
            if (GamePanel.score>=j){
                k=1;}
            GamePanel.currentState = new GameOverState();
        }
    }


    @Override
    public void render(Graphics g) {
        g.drawImage(Resources.bg, bg1L, 0, 288, 512, null);
        g.drawImage(Resources.bg, bg2L, 0, 288, 512, null);

        g.drawImage(Resources.ground, ground1L, 400, 336, 112, null);
        g.drawImage(Resources.ground, ground2L, 400, 336, 112, null);

        if (flag == 0)
            g.drawImage(Resources.getReady, 50, 200, null);
        else{
        for (int i = 0; i < this.entities.size(); i++) {
            Entity entity = this.entities.get(i);

            g.drawImage(entity.getImage(), entity.x, entity.y, null);
        }}
        x=0;
        for(int l=t-1;l>=0;l--)
        {
            g.drawImage(image[a[l]],x,0,null);
            x=x+36;
        }

    }


    @Override
    public void keyPressed(int keyCode) {
        flag = 1;
        GamePanel.check=0;
        if (keyCode==KeyEvent.VK_SPACE)
            this.bird.boost();
       else if (keyCode==KeyEvent.VK_DOWN)
           this.bird.downBoost();
        else
        this.bird.jump();


    }

    @Override
    public void keyReleased(int keyCode) {

    }

    @Override
    public void mouseClicked(int x, int y) {
        flag = 1;
        GamePanel.check=0;
        this.bird.jump();
    }

    @Override
    public void mouseReleased(int x, int y) {

    }

    private void scoreGenerator() {
        this.i=GamePanel.score;
        this.t=0;
        while(this.i>0)
        {
            a[t]=this.i%10;
            this.i=this.i/10;
            this.t++;
        }

    }
}