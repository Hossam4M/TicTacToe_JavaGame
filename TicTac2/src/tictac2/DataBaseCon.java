
//package tictac2;


import org.mariadb.jdbc.*;
import java.sql.* ;

public class DataBaseCon{

    public DataBaseCon(){
        try{

            Connection con = DriverManager.getConnection
                    ("jdbc:mariadb://localhost:3306/?user=root&password=");

            Statement stmt = con.createStatement() ;
            String sql1 = "CREATE DATABASE if not exists TicTacGame;";
            stmt.executeUpdate(sql1) ;
            String sql2 = "use TicTacGame;";
            stmt.executeUpdate(sql2) ;
            String sql3 = "CREATE TABLE if not exists Games (" +
                    "ID int primary key AUTO_INCREMENT," +
                    "GameDate varChar(50) not null,"+
                    "Mode varchar(10) not null," +
                    "winner varchar(50) not null," +
                    "player1 varchar(50) not null," +
                    "player2 varchar(50) not null," +
                    "pattern varchar(50) not null);";
            stmt.executeUpdate(sql3) ;
            

            stmt.close();
            con.close();
        }

        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    

    public static void main(String[] args){
        new DataBaseCon();
        

    }
}
