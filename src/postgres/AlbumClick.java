package postgres;
import java.sql.*;

public class AlbumClick {
    public static String[][] main(String Album_ID) {
        String[][] albumSongs = new String[20][3];
        Connection c;
        Statement stmt;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url, creds.username, creds.password);
            stmt = c.createStatement();
            String sql = "SELECT name,views FROM SONGS WHERE album_id = '"+Album_ID+"';";
            ResultSet rs = stmt.executeQuery(sql);
            int i = 0;
            while(rs.next()){
                albumSongs[i][0] = String.valueOf(i+1);
                albumSongs[i][1] = rs.getString("name");
                albumSongs[i][2] = rs.getString("views");
                i++;
            }
        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }
        return albumSongs;
    }
}
