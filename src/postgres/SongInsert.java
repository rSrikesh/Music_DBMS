package postgres;
import java.sql.*;

public class SongInsert {
    public static int main(String Song_ID,String Name, String Album_ID,String views){
        Connection c;
        Statement stmt;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url, creds.username, creds.password);
            stmt = c.createStatement();
            String sql = "INSERT INTO songs (song_id, name, album_id, views) VALUES ('"+Song_ID+"','"+Name+"','"+Album_ID+"','"+views+"');";
            int x = stmt.executeUpdate(sql);
            return x;
        }catch(Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}
