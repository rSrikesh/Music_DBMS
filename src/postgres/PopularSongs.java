package postgres;
import java.sql.*;
import java.util.*;

public class PopularSongs{
    public static void main(String A_ID){
        Connection c;
        Statement stmt;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url,creds.username,creds.password);
            stmt = c.createStatement();
            int count = CountAlbums.main(A_ID);
            ResultSet rs = stmt.executeQuery("SELECT album_id from albums where artist_id = '"+A_ID+"'");
            String sql = "SELECT name,views from songs where ";
            for(int i = 0;i<count;i++){
                rs.next();
                sql += "album_id = '"+rs.getString("album_id")+"'";
                if(i!=count-1){
                    sql += " or ";
                }
            }
            ResultSet rs2 = stmt.executeQuery(sql+" order by views DESC limit 5");
            Map<String,Integer> hm = new LinkedHashMap<String,Integer>();
            while(rs2.next()){
                hm.put(rs2.getString("name"),rs2.getInt("views"));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}