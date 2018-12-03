package pl.grz.dvdshop.dao;

import pl.grz.dvdshop.exception.PersistenceException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class ConnectionManager {
    //Information for connecting to HSQLDB database.
    private static final String STR_DRIVER = "org.hsqldb.jdbcDriver";
    private static final String DATABASE = "article";
    private static final String STR_CON = "jdbc:hsqldb:file:" + DATABASE;
    private static final String USER = "sa";
    private static final String PASSWORD = "";
    private static Logger log = Logger.getLogger(ConnectionManager.class);

    public static Connection getConnection() throws PersistenceException {
        Connection conn = null;
        try {
            Class.forName(STR_DRIVER);
            conn = DriverManager.getConnection(STR_CON, USER, PASSWORD);
            conn.setAutoCommit(false);

            log.debug("Open the connection to the database!");
            return conn;
        } catch (ClassNotFoundException e) {
            String errorMsg = "Driver (JDBC) not found";
            log.error(errorMsg, e);
            throw new PersistenceException(errorMsg, e);
        } catch (SQLException e) {
            String errorMsg = "Error getting connection";
            log.error(errorMsg, e);
            throw new PersistenceException(errorMsg, e);
        }
    }
}
