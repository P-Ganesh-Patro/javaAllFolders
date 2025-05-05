package jdbc_conn;

import java.sql.Driver;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class DriverInterface {
    public static void main(String[] args) throws Exception {
        Driver driver  =  new SQLServerDriver();
        String DriverUrl = "jdbc:sqlserver://localhost:1433;databaseName=ADMIN;encrypt=true;trustServerCertificate=true";
        Boolean canConnect = driver.acceptsURL(DriverUrl);
        System.out.println(canConnect);
        System.out.println(driver.getMajorVersion());
        System.out.println(driver.getMinorVersion());
    }
    
}
