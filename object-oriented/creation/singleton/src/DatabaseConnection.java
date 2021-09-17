
/**
 * This is a Singleton sample implementation class. It simulates a MySQL
 * database standard connection, BUT no real connection exists to (unless you
 * yourself create one).
 */
package singleton

import java.sql.Connection;
import java.sql.DriveManager;
import java.sql.SQLException;

/**
 * Database Connection Singleton Object.
 *
 * <p>
 * Note that this is a Singleton Object. Once you establish a connection, that
 * connection will remain the same for the rest of your connections.
 */
public class Database {
    private static Connection connection = null;

    /**
     * Constructor.
     *
     * <p>
     * Establishes a connection to MySQL database.
     */
    private Database() {
        String url = "jdbc:mysql://localhost:3306/MyDatabase";
        // Please don't use root user for world cases
        // Also, this would normally be obtained from a config file
        String user = "root";
        String pass = "root";

        // Establish the connection
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Return connection to database.
     * @return Connection.
     */
    public static Connection getConnection() {
        return this.connection;
    }
}
