package com.wecp.progressive.config;
<<<<<<< HEAD

=======
>>>>>>> 6d9f8fb4927edf91f75ad2579f6b8862474886c6
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {
<<<<<<< HEAD
    private static final Properties properties = new Properties();

    static {
        loadProperties();
    }

    private static void loadProperties() {
 try (InputStream input = DatabaseConnectionManager.class.getClassLoader()
 .getResourceAsStream("application.properties"))
  {
            if (input == null) {
                throw new IllegalStateException("resource.properties not found in classpath");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Error loading properties file", e);
        }
    }

    public static Connection getConnection() throws SQLException {
        String url = properties.getProperty("spring.datasource.url");
        String user = properties.getProperty("spring.datasource.username");
        String password = properties.getProperty("spring.datasource.password");
        return DriverManager.getConnection(url, user, password);
    }
}
=======
private static final Properties properties = new Properties();
static{
    loadProperties();
}
private static void loadProperties(){
    try (InputStream input = DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties")) {
        if(input == null){
            throw new IllegalStateException("resource.properties not found in classpath");
        }
        properties.load(input);
    } catch (IOException e) {
        throw new RuntimeException("Error loading properties file",e);
    }
}
public static Connection getConnection() throws SQLException{
    return DriverManager.getConnection(properties.getProperty("spring.datasource.url"), properties.getProperty("spring.datasource.username"), properties.getProperty("spring.datasource.password"));
}
 }
>>>>>>> 6d9f8fb4927edf91f75ad2579f6b8862474886c6
