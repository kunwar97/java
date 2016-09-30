package Game;

import java.awt.*;

/**
 * Created by kunwar on 23-09-2016.
 */
public class PipeBottom extends Entity {

    public PipeBottom(int x) {
        super(x,0);
        this.xVel = -5;
        this.setYposition();
    }
    @Override
    public void update() {
        super.update();

        if (this.x <= -60) {
            this.x = 288;
            this.setYposition();
        }
    }


    @Override
    public Image getImage() {
        return Resources.bottomtube;
    }

    @Override
    public int getWidth() {
        return 52;
    }

    @Override
    public int getHeight() {
        return 320;
    }
    private void setYposition() {

        this.y= Pipes.y1+400;
    }
}
