package postgres;
import java.sql.*;

public class AlbumInsert {
    public static int main(String Album_ID, String Album_Name, String Audio_Format, String Artist_ID, int Number_Of_Songs,String Date) {
        Connection c;
        Statement stmt;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url, creds.username, creds.password);
            stmt = c.createStatement();
            String sql = "INSERT INTO albums (album_id, artist_id, album_name, number_of_songs, audio_format, copyright_date) VALUES ('"+Album_ID+"','"+Artist_ID+"','"+Album_Name+"','"+Number_Of_Songs+"','"+Audio_Format+"','"+Date+"');";
            int x = stmt.executeUpdate(sql);
            return x;
        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }
        return 0;
    }
}
