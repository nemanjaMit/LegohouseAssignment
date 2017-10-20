package DBAccess;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {

    private static Connection singleton;

    private static final String IP = "46.101.108.233";
    private static final String PORT = "3306";
    private static final String DATABASE = "legohouseDB";
    private static final String USERNAME = "nm";
    private static final String PASSWORD = "gsk37was";
    
    private static final String URL = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE;

    public static Connection getConnection() throws Exception {
        if (singleton == null || singleton.isClosed()) {
            Class.forName("com.mysql.jdbc.Driver");
            singleton = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        return singleton;
    }
}