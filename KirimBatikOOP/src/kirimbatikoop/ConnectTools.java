package kirimbatikoop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectTools {
    private static Connection konek;
    public static Connection connect(String db){
        try{konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db,"root","");}
        catch(SQLException se){System.out.println("koneksi gagal" + se);}
        return konek;
    }
}
