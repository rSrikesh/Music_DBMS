package postgres;
import java.sql.*;

public class MostViewedSongAlbum {
    public static String main(String A_ID) {
        Connection c;
        Statement stmt;
        String Album_id = "";
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url, creds.username, creds.password);
            stmt = c.createStatement();
            int count = CountAlbums.main(A_ID);
            ResultSet rs = stmt.executeQuery("SELECT album_id from albums where artist_id = '"+A_ID+"'");
            String sql = "SELECT name,views,album_id from songs where ";
            for(int i = 0;i<count;i++){
                rs.next();
                sql += "album_id = '"+rs.getString("album_id")+"'";
                if(i!=count-1){
                    sql += " or ";
                }
            }
            ResultSet rs2 = stmt.executeQuery(sql+" order by views DESC limit 1");
            while(rs2.next()){
                Album_id = rs2.getString("album_id");
            }
        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }
        return Album_id;
    }
}
