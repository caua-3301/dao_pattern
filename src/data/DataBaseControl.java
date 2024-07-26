package data;

import exception.DbGenericError;

import javax.swing.plaf.nimbus.State;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DataBaseControl {
    private static Connection connection = null;

    //close result set
    public static void closeResultSet(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException error) {
                throw new DbGenericError(error.getMessage());
            }
        }
    }

    //close statement
    public static void closeStatement(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException error) {
                throw new DbGenericError(error.getMessage());
            }
        }
    }

    //close connection
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException error) {
                throw new DbGenericError(error.getMessage());
            }
        }
    }

    //create a connection with database
    public static Connection getConnection() {
        if (connection == null) {
            try {
                Properties properties = getProperties();
                connection = DriverManager.getConnection(properties.getProperty("url"), properties);
                return connection;
            } catch (SQLException error) {
                throw new DbGenericError(error.getMessage());
            }
        }
        return connection;
    }

    //get properties of database
    private static Properties getProperties() {
        try (FileInputStream input_stream = new FileInputStream("db.properties")) {
            Properties properties = new Properties();
            properties.load(input_stream);
            return properties;
        } catch (IOException error) {
            throw new DbGenericError(error.getMessage());
        }
    }
}
