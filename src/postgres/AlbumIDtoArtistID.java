package postgres;
import java.sql.*;

public class AlbumIDtoArtistID {
    public static String main(String Album_ID){
        Connection c;
        Statement stmt;
        String Artist_ID = "";
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url, creds.username, creds.password);
            stmt = c.createStatement();
            String sql = "SELECT artist_id from albums where album_id = '"+Album_ID+"';";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Artist_ID = rs.getString("artist_id");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return Artist_ID;
    }
}
