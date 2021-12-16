package postgres;
import java.sql.*;

public class ManagerIdtoArtistId {
    public static String main(String Manager_ID){
        Connection c;
        Statement stmt;
        String Artist_ID ="";
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url, creds.username, creds.password);
            stmt = c.createStatement();
            String sql = "SELECT artist_id FROM artists WHERE manager_id = '"+Manager_ID+"';";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                Artist_ID = rs.getString("artist_id");
            }
            rs.close();
            stmt.close();

        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }
        return Artist_ID;
    }
}
