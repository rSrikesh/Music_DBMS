package postgres;
import java.sql.*;

public class AlbumIDtoName {
    public static String main(String Album_ID){
        Connection c;
        Statement stmt;
        String Album_Name = "";
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url, creds.username, creds.password);
            stmt = c.createStatement();
            String sql = "SELECT album_name from albums where album_id = '"+Album_ID+"';";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Album_Name = rs.getString("album_name");
            }
        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }
        return Album_Name;
    }
}
