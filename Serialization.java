import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Serialization
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb" ,
            "root" , "password");
            System.out.println("Database connected Succesfully!");
            
            con.close();
        }
        catch (Exception e)
        {
 System.out.println("DB Connection Error:" + e.getMessage());
        }
            
        }
    }

