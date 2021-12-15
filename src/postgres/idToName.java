package postgres;

import java.sql.*;

public class idToName {
    public static String[] main(String id){
        String[] output = new String[3];

        if (id.equals("admin")){
            output[0] = "Admin";
            output[1] = "administrator";
            output[2] = "ADMINI";
            return output;
        }

        String table = null;
        char identifier = id.charAt(0);
        String type = null;
        if (identifier == 'A'){
            table = "Artists";
            type = "artist";
        }

        else if (identifier == 'M'){
            table = "Manager";
            type = "manager";
        }

        Connection c;
        Statement stmt;
        String name = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(creds.url, creds.username, creds.password);


            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT name FROM " + table + " WHERE " + type + "_id = '"+ id + "';");
            while ( rs.next() ) {
                name = rs.getString("name");
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

        output[0] = name;
        output[1] = table;
        output[2] = id;
        return output;
    }
}
