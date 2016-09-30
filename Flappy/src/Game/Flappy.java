package Game;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by kunwar on 19-09-2016.
 */
public class Flappy {
    public static Connection conn;
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        GamePanel panel=new GamePanel();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Flappy.conn= DriverManager.getConnection("jdbc:sqlite:src/score.sqlite");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
