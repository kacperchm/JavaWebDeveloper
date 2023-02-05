package pl.edu.wszib.jwd.Spotkanie4.lab19;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDataSource {
    public static void main(String[] args) {
        SQLServerDataSource source = new SQLServerDataSource();
        source.setUser("******");
        source.setPassword("******");
        source.setServerName("morfeusz.wszib.edu.pl");
        source.setPortNumber(1433);
        source.setDatabaseName("*****");
        source.setTrustServerCertificate(true);

        String sql = "SELECT * FROM Forum.Topics";

        try(Connection con = source.getConnection();
            Statement statement = con.createStatement()) {

            ResultSet resultSet = statement.executeQuery(sql);
            int id;
            String topicBody;

            while (resultSet.next()) {
                if((topicBody = resultSet.getString("TopicBody")) != null) {
                    id = resultSet.getInt("ID");
                    System.out.println(id + " - " + topicBody);
                }
            }

        } catch (SQLException e) {
            System.out.println("Wystąpił problem: " + e.getMessage());
        }

    }
}
