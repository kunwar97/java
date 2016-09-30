package Game;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by kunwar on 22-09-2016.
 */
public class DatabaseThread {
    public static Statement statement;

    public void submitscore(int a){

    String sql="INSERT INTO score VALUES"+"("+a+")";


    try {
        statement=Flappy.conn.createStatement();
        statement.execute(sql);
        ResultSet resultSet=statement.executeQuery("SELECT * FROM score");
//        System.out.println("score submitted");
//        System.out.println(resultSet.getInt("score"));


    } catch (SQLException e) {
        e.printStackTrace();
    }

}
public int gethighscore(){
    String sql="SELECT * FROM score";
    int score=0;
    int highscore=0;
    try {
        statement=Flappy.conn.createStatement();

       ResultSet resultSet= statement.executeQuery(sql);
        while ( resultSet.next()){
        score =resultSet.getInt("score");
            if (score>highscore)
                highscore=score;
       }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return highscore;
}
}
