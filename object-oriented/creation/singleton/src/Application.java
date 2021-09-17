/**
 * Sample main class. Where singleton object is called.
 */
package singleton

import java.sql.Connection;
import java.sql.PreparedStatement;

import Database;

/** Application Object */
public class Application {

    public static void main(String[] args)
        throws SQLException {
        Connection con = Database.getConnection();
        // Save database connection to interact with public it

        // Do whatever actions here
        String query = "SELECT ID, NAME, SURNAME FROM STUDENTS;"
        PreparedStatement ps = con.preparedStatement(query);

        // Please note this is just a sample class, should not have your code
        // consulting the database in your main class, but in this example the
        // important part is the singleton class (Database), not the logic
        // itself
    }

}
