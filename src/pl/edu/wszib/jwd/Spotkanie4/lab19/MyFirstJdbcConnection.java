package pl.edu.wszib.jwd.Spotkanie4.lab19;

import java.sql.*;

public class MyFirstJdbcConnection {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://morfeusz.wszib.edu.pl;encrypt=true;databaseName=******;user=*****;password=*****;trustServerCertificate=true";
        try (Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement()) {

            String sql = "SELECT TOP 10 * FROM Person.Contact ";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("FirstName") + " " + resultSet.getString("LastName"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
