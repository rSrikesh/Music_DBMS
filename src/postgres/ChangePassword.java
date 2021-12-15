package postgres;
import java.sql.*;

public class ChangePassword {
    public static int main(String old_password , String new_password,String A_ID){
        Connection c;
        Statement stmt;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url,creds.username,creds.password);
            stmt = c.createStatement();
            String sql = "Update userdetails set password = '"+new_password+"' WHERE id = '" + A_ID+"' and password = '" + old_password +"';";
            stmt.executeUpdate(sql);
            stmt.close();

        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }

        return 0;
    }
}
