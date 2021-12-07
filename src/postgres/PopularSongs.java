package postgres;
import java.sql.*;
import java.text.*;

public class PopularSongs{
    public static String[][] main(String A_ID){
        Connection c;
        Statement stmt;
        String[][] popularSongs = new String[5][5];
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
            int i = 0;
            NumberFormat formatter = new DecimalFormat("###,###,###");
            while(rs2.next()){
                popularSongs[i][0] = String.valueOf(i+1);
                popularSongs[i][1] = rs2.getString("name");
                popularSongs[i][2] = formatter.format(rs2.getInt("views"));
                i++;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return popularSongs;
    }
}