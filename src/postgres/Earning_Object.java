package postgres;

public class Earning_Object{
    public String[][] table;
    public String total;

    Earning_Object(){
        table = new String[11][4];
    }

    Earning_Object(int l){
        table = new String[l][4];
    }
}