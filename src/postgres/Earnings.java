package postgres;
import java.sql.*;

class Music_Object{
    public String song_name;
    public int views;
    public float Earnings;
    public float Total_Earnings;
    Music_Object(){
        song_name = "";
        views = 0;
        Earnings = 0;
        Total_Earnings = 0.0f;
    }
}

public class Earnings {
    final static float payment_per_view = 0.01f;
    static float total_earnings = 0.0f;
    public static Music_Object[] main(String A_ID){
        Music_Object[] o = new Music_Object[10]; 
        Connection c;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url,creds.username,creds.password);
            Statement s = c.createStatement();
            int count =  CountAlbums.main(A_ID);
            ResultSet rs = s.executeQuery("SELECT album_id from ALBUMS where artist_id = '"+A_ID+"'");
            String sql = "SELECT name,views from songs where ";
            for(int i = 0;i<count;i++){
                rs.next();
                sql += "album_id = '"+rs.getString("album_id")+"'";
                if(i!=count-1){
                    sql += " or ";
                }
            }
            String total = sql;
            sql += " order by views desc limit 10";
            ResultSet rs1 = s.executeQuery(sql); 
            int i = 0;
            while(rs1.next()){
                o[i] = new Music_Object();
                o[i].song_name = rs1.getString("name");
                o[i].views = rs1.getInt("views");
                o[i].Earnings = o[i].views*payment_per_view;
                i++;
            }
            ResultSet rs2 = s.executeQuery(total);
            while(rs2.next()){
                total_earnings += rs2.getInt("views")*payment_per_view;
            }
            o[0].Total_Earnings = total_earnings;
        }catch(Exception e){
            e.printStackTrace();
        }
        return o;
    }
}
