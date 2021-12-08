package postgres;
import java.sql.*;
import java.text.*;

public class Earnings {
    final static float payment_per_view = 0.01f;
    static float total_earnings = 0.0f;

    public static Earning_Object main(String A_ID){
        Earning_Object obj = new Earning_Object();
        obj.table[0][0] = "song";
        obj.table[0][1] = "views";
        obj.table[0][2] =  "pay per view";
        obj.table[0][3] = "song earnings";

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
            int i = 1;
            NumberFormat formatter = new DecimalFormat("###,###,###");
            NumberFormat formatter1 = new DecimalFormat("###,###,###.#");
            while(rs1.next()){
                obj.table[i][0] = rs1.getString("name");
                obj.table[i][1] = formatter.format(rs1.getInt("views"));
                obj.table[i][2] = "$0.05";
                obj.table[i][3] = "$"+formatter1.format(rs1.getInt("views")*payment_per_view);
                i++;
            }
            ResultSet rs2 = s.executeQuery(total);
            while(rs2.next()){
                total_earnings += rs2.getInt("views")*payment_per_view;
            }
            obj.total = formatter1.format(total_earnings);
        }catch(Exception e){
            e.printStackTrace();
        }
        return obj;
    }
}
