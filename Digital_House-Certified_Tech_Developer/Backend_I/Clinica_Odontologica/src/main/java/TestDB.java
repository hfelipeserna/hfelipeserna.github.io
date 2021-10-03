package main.java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDB {
    public static void main(String[] args) throws Exception {

        Connection connection = null;

        try {
            //1. Get a connection object.
            connection = getConnection();

            //2. Create a statement object for execute statements.
            Statement statement = connection.createStatement();

            //2a. Insert record into database.
            statement.execute(StatementGenerator_dentist.insert("34GH092K", "Astrid Yurani","Bedoya Rendón"));
            statement.execute(StatementGenerator_dentist.insert("9UY67GB3", "Neyla Milena","Zapata Guzmán"));
            statement.execute(StatementGenerator_dentist.insert("U98I4RN7", "Luis Fernando","Estrada Gómez"));
            statement.execute(StatementGenerator_dentist.insert("T678UJBM", "Sebastián","Atehortúa Rúa"));
            statement.execute(StatementGenerator_dentist.insert("23YU78VB", "Günger","Klauss Koss"));

            //2b. Delete a record from database.
            statement.execute(StatementGenerator_dentist.delete(1));

            //2c. Read all record from database.
            ResultSet resultSet = statement.executeQuery(StatementGenerator_dentist.selectAll());
            while(resultSet.next()) {
                String record = resultSet.getInt("id") + " - " +
                        resultSet.getString("professional_card") + " - " +
                        resultSet.getString("name") + " - " +
                        resultSet.getString("surname");
                System.out.println(record);
            }

        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            // Don't forget close the database connection
            connection.close();
        }

    }

    public static Connection getConnection() throws Exception {
        String jdbcDriver = "org.h2.Driver";
        String urlDB =  "jdbc:h2:D:/Cursos/Digital House - CTD/hfelipeserna.github.io/Digital_House-Certified_Tech_Developer/Backend_I/Clinica_Odontologica/BDClinicaOdontologica; DB_CLOSE_DELAY=-1; INIT=RUNSCRIPT FROM 'db_create.sql';";
        String userLoginDB = "admin";
        String userLoginPassword = "4dm1n";

        // Load database controller (H2 database)
        Class.forName(jdbcDriver);
        return DriverManager.getConnection(urlDB, userLoginDB, userLoginPassword);
    }
}
