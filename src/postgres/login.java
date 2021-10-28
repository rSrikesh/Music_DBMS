package postgres;

import java.sql.*;

public class login {
    public static String main(String user, String pass){
        Connection c;
        Statement stmt;
        String id_ = null;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://john.db.elephantsql.com/rnypvzky",
                            "rnypvzky", "L_fJIvDZd2K-e1dxrC0sFbMEDezt87GA");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM userdetails;");
            while ( rs.next() ) {
                String id = rs.getString("user_id");
                String password = rs.getString("password");
                if (user.equals(id) && pass.equals(password)){
                    id_ = id;
                    break;
                }
            }

            rs.close();
            stmt.close();

            c.close();
        }


        catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }

    return id_;
    }
}
