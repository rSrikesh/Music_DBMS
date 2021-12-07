package postgres;

public class User {
    public String name, userid, userType;

    public User(String uname, String pass){
        String[] a = login.main(uname, pass);
        name = a[0];
        userType = a[1];
        userid = a[2];
    }

}
