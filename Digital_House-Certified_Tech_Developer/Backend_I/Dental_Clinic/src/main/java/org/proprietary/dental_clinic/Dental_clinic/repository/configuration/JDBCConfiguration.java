package org.proprietary.dental_clinic.Dental_clinic.repository.configuration;

import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class JDBCConfiguration {

    private String jdbcDriver;
    private String dbUrl;
    private String userName;
    private String password;

    //This constructor can use another access configuration
    public JDBCConfiguration(String jdbcDriver, String dbUrl, String userName, String password) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.userName = userName;
        this.password = password;
    }

    public JDBCConfiguration() {
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:mem:dental-clinic;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'db_scripts.sql';";
        this.userName = "sa";
        this.password = "sa";
    }

    public Connection connectToDatabase() throws Exception {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl, userName, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }
}
