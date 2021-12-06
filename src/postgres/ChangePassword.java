package postgres;
import java.sql.*;

public class ChangePassword {
    public static int main(String old_password , String new_password,String A_ID){
        Connection c;
        Statement stmt;
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url,creds.username,creds.password);
            stmt = c.createStatement();
            String sql = "SELECT password FROM userdetails where A_ID = '"+A_ID+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                String password = rs.getString("password");
                if(password.equals(old_password)){
                    String sql1 = "UPDATE userdetails set password = '"+new_password+"' where A_ID = '"+A_ID+"'";
                    stmt.executeUpdate(sql1);
                    return 1;
                }else{
                    System.out.println("Wrong Password");
                }
            }else{
                System.out.println("Wrong A_ID");
            }
        }catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }
        return 0;
    }
}
