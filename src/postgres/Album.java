package postgres;
import java.sql.*;

public class Album {
    public static String[] main(String A_ID){
        Connection c;
        Statement stmt;
        String[] name;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url, creds.username, creds.password);
            int album_count = 0;
            int i = 0;

            stmt = c.createStatement();
            ResultSet count = stmt.executeQuery( "SELECT count(*) as count FROM albums WHERE artist_id = '"+ A_ID + "';");
            while(count.next()){
                album_count = count.getInt("count");
            }
            String[] albums = new String[album_count];
            ResultSet rs = stmt.executeQuery( "SELECT album_id FROM albums WHERE artist_id = '"+ A_ID + "';");
            while (rs.next()) {
                albums[i] = rs.getString("album_id");
                i++;
            }
            rs.close();
            stmt.close();
            c.close();
            return  albums;
        }

        catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        return new String[]{null,null,null};
    }
}