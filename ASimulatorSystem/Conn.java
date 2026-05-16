package ASimulatorSystem;
import java.sql.*;

public class Conn {
    Connection connection;
    Statement statement;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","WJ28@krhps");//bankSystem
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
