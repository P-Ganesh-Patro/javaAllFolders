package jdbc_conn;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {
    private static String url;
    private static String userName;
    private static String password;
    static {
        try {
            Properties props = new Properties();
            InputStream input = DBConnection.class.getClassLoader().getResourceAsStream("db.properties");
            if (input == null) {
                System.out.println("can not find db.properties file");
            }
            props.load(input);
            url = props.getProperty("db.url");
            userName = props.getProperty("db.userName");
            password = props.getProperty("db.password");

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static Connection getObjConnection() throws Exception {
        return DriverManager.getConnection(url, userName, password);
    }
}
