package postgres;
import java.sql.*;

public class AlbumNametoID {
    public static String main(String Album_Name){
        Connection c;
        Statement stmt;
        String Album_ID = "";
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url, creds.username, creds.password);
            stmt = c.createStatement();
            String sql = "SELECT album_id from albums where album_name = '"+Album_Name+"';";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Album_ID = rs.getString("album_id");
            }
        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }
        return Album_ID;
    }
}
