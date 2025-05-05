import java.sql.Connection;
import java.sql.DriverManager;

public class DBdetails {
    private String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=jdbcQues;encrypt=true;trustServerCertificate=true";
    private String USERNAME = "sa";
    private String PASSWORD = "Imaginnovate@123";

    public Connection getObjConnection() throws Exception {
        return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

    }

}
