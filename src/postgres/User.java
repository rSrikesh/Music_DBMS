package postgres;
import postgres.login;

public class User {
    private String username, password;
    public String name, userid, userType;

    public User(String uname, String pass){
        username  = uname;
        password = pass;
        String[] a = login.main(username, password);
        name = a[0];
        userType = a[1];
        userid = a[2];
    }

}
