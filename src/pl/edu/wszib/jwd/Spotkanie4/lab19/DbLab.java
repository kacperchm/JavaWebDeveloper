package pl.edu.wszib.jwd.Spotkanie4.lab19;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.*;

public class DbLab {
    public static void main(String[] args) {
        SQLServerDataSource source = new SQLServerDataSource();
        source.setUser("******");
        source.setPassword("******");
        source.setServerName("morfeusz.wszib.edu.pl");
        source.setPortNumber(1433);
        source.setDatabaseName("AdventureWorks");
        source.setTrustServerCertificate(true);

        String sql = "SELECT TOP 10 * FROM Person.Contact WHERE LastName LIKE ?";

        try (Connection con = source.getConnection();
             PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1,"A%");
            ResultSet resultSet = statement.executeQuery();
            String name;
            String lastName;
            String email;

            while (resultSet.next()) {
                name = resultSet.getString(4);
                lastName = resultSet.getString(6);
                email = resultSet.getString(8);
                System.out.print("Imię: " + name);
                System.out.print("   Nazwisko: " + lastName);
                System.out.println("   Email: " + email);

            }

        } catch (SQLException e) {
            System.out.println("Wystąpił problem: " + e.getMessage());
        }
    }
}
