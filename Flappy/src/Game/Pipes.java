package Game;

import java.awt.*;

/**
 * Created by kunwar on 22-09-2016.
 */
public class Pipes extends Entity {
    public static int y1 = 0;

    public Pipes(int x) {
        super(x, 0);
        this.xVel = -5;
        this.setYPosition();


    }

    @Override
    public void update() {
        super.update();

        if (this.x <= -60) {
            this.x = 288;
            this.setYPosition();
        }
    }

    @Override
    public Image getImage() {

        return Resources.toptube;

    }

    @Override
    public int getWidth() {
        return 52;
    }

    @Override
    public int getHeight() {
        return 320;
    }

    private void setYPosition() {
        int a = Util.randomInt(5);

        if (a == 0) {
          //  System.out.println("0 is called");

            this.y = -100;
            y1 = -100;

        } else if (a == 1) {
            //System.out.println("1 is called");
            this.y = -150;
            y1 = -130;


        } else if (a == 2) {
            //System.out.println("2 is called");
            this.y = -200;
            y1 = -180;

        } else if (a == 3) {//80
            //System.out.println("3 is called");
            this.y = -300;
            y1 = -300;

        } else if (a == 4) {
            //System.out.println("4 is called");
            this.y = 0;
            this.y1 = 0;


        }


    }
}
