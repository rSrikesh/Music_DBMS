package postgres;
import java.sql.*;


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
            while(rs2.next()){
                popularSongs[0][i] = rs2.getString("name");
                popularSongs[1][i] = rs2.getString("views");
                i++;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return popularSongs;
    }
}