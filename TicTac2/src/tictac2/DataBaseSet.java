
package tictac2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.mariadb.jdbc.*;
import java.sql.* ;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class DataBaseSet {
    
    public DataBaseSet(String mode,String winner,String player1,String player2,String pattern){
        try{
            
            Connection con = DriverManager.getConnection
                    ("jdbc:mariadb://localhost:3306/?user=root&password=");
            
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();

            String date;
            date = dateFormat.format(cal.getTime());

            Statement stmt = con.createStatement() ;
            
            String sql1 = "use TicTacGame;";
            stmt.executeUpdate(sql1) ;
            
            String sql2 = "INSERT INTO Games (GameDate, Mode, winner, player1, player2, pattern) " +
                    "VALUES ('"+ date +"','"+ mode +"', '"+ winner +"', '"+ player1 +"', '"+ player2 +"', '"+ pattern +"');";
            stmt.executeQuery(sql2) ;
            
     
            stmt.close();
            con.close();
        }

        catch(SQLException ex){
            ex.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        new DataBaseSet("single","comp","hossam","comp","123456789");
//    }
}
    

