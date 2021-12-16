package postgres;

import javax.sound.midi.SysexMessage;
import java.sql.*;

public class numberOfSongs {
    public static int main(String A_ID, String[] albums){
        int songs = 0;
        Connection c;
        Statement stmt;
        ResultSet rs;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url, creds.username, creds.password);
            stmt = c.createStatement();
            int count = CountAlbums.main(A_ID);
            for(String i: albums) {
                String sql = "SELECT count(*) as COUNT from songs where album_id = '" + i+"';";
                rs = stmt.executeQuery(sql);
                while(rs.next()) {
                    songs += rs.getInt("COUNT");
                }
                rs.close();
            }
            stmt.close();
            c.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return songs;
    }
}
