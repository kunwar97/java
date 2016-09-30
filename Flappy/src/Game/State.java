package Game;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by kunwar on 19-09-2016.
 */
abstract public class State {
    public abstract void update();
    public abstract void render(Graphics g);
    public abstract void keyPressed(int keyCode);
    public abstract void keyReleased(int keyCode);
    public abstract void mouseClicked(int x , int y);
    public abstract void mouseReleased(int x , int y);
}
