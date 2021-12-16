package postgres;
import java.sql.*;
import java.text.*;

public class AlbumClick {
    public static Album main(String Album_ID) {
        Album album = new Album();
        album.id = Album_ID;
        Connection c;
        Statement stmt;
        NumberFormat formatter = new DecimalFormat("###,###,###");
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url, creds.username, creds.password);
            stmt = c.createStatement();
            String sql = "SELECT album_name,audio_format, number_of_songs FROM albums WHERE album_id = '"+Album_ID+"';";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                album.name = rs.getString("album_name");
                album.format = rs.getString("audio_format");
                album.number_of_songs = rs.getInt("number_of_songs");
            }
            rs.close();
            stmt.close();

        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }

        album.songs = new String[album.number_of_songs][3];

        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url, creds.username, creds.password);
            stmt = c.createStatement();
            String sql = "SELECT name,views FROM SONGS WHERE album_id = '"+Album_ID+"';";
            ResultSet rs = stmt.executeQuery(sql);

            int i = 0;
            while(rs.next()){
                album.songs[i][0] = String.valueOf(i+1);
                album.songs[i][1] = rs.getString("name");
                album.songs[i][2] = formatter.format(rs.getInt("views"));
                i++;
            }

            rs.close();
            stmt.close();

        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }

        return album;
    }
}
