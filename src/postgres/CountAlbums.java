package postgres;
import java.sql.*;

public class CountAlbums {
    public static int main(String A_ID){
        Connection c;
        Statement stmt;
        int album_count =0;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url, creds.username, creds.password);
            stmt = c.createStatement();
            ResultSet count = stmt.executeQuery( "SELECT count(*) as count FROM albums WHERE artist_id = '"+ A_ID + "';");
            while(count.next()){
                album_count = count.getInt("count");
            }
            count.close();
            stmt.close();
            c.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return album_count;
    }
}
