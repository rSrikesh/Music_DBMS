package postgres;

import java.sql.*;

public class login {
    public static String[] main(String user, String pass){
        Connection c;
        Statement stmt;
        String id_ = "";

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url, creds.username, creds.password);

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM userdetails;");
            while ( rs.next() ) {
                String id = rs.getString("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                if (user.equals(username) && pass.equals(password)){
                    id_ = id;
                    break;
                }
            }

            rs.close();
            stmt.close();

            c.close();
        }


        catch (Exception e) {
//            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }

    return idToName.main(id_);
    }
}
