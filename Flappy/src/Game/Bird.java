package Game;

import java.awt.*;

/**
 * Created by kunwar on 22-09-2016.
 */
public class Bird extends Entity {
    public static Image bird[] = {Resources.bird1, Resources.bird2, Resources.bird3, Resources.bird2};

    public Bird(int x, int y) {
        super(x, y);
    }

    private  int i = 0;

    @Override
    public Image getImage() {
        while(true) {
            try {
                Thread.sleep(8);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
            i %= 4;
            return Bird.bird[i];
        }


    }

    @Override
    public int getWidth() {
        return 34;
    }

    @Override
    public int getHeight() {
        return 24;
    }
    public void jump() {
         {
            Resources.jumpSound.play();

             this.yVel = -16;
            this.yAcc = 3;
        }
    }
    public void boost(){
        Resources.jumpSound.play();
        this.yVel=-25;
        this.yAcc=3;
    }
    public void downBoost(){
        this.yVel=10;
        this.yAcc=4;
    }
}
