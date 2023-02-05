package pl.edu.wszib.jwd.Spotkanie4.ProjectBudget;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.math.BigDecimal;
import java.sql.*;
import java.text.NumberFormat;

public class HomeBudget {

    private static final String DB_USER = "******";
    private static final String DB_PASS = "******";
    private static final String SQL_INSERT_ENTRY = "INSERT INTO Budget.BudgetEntries(EntryName,Amount) VALUES (?, ?)";
    private static final String SQL_GET_BALANCE = "SELECT SUM(Amount) AS Balance FROM Budget.BudgetEntries";
    public static void main(String[] args) {
        HomeBudget homeBudget = new HomeBudget();
        BudgetEntry budgetEntry = new BudgetEntry();

        //TODO: Potrzebna walidacja danych

        budgetEntry.setEntryName(args[0]);
        budgetEntry.setAmount(new BigDecimal(args[1]));



        try(Connection connection = homeBudget.connect(DB_USER,DB_PASS);
            Statement statement = connection.createStatement()) {
            PreparedStatement ps = connection.prepareStatement(SQL_INSERT_ENTRY);
            ps.setString(1, budgetEntry.getEntryName());
            ps.setBigDecimal(2, budgetEntry.getAmount());
            ps.execute();
            ps.close();
            BigDecimal balance;
            ResultSet resultSet = statement.executeQuery(SQL_GET_BALANCE);
            if(resultSet.next()) {
                balance = resultSet.getBigDecimal("Balance");
            } else {
                balance = new BigDecimal(0);
            }

            System.out.print("Zapisano! kwota: " + budgetEntry.getAmount());
            System.out.println(", nazwa: " + budgetEntry.getEntryName());
            System.out.println("Twoje saldo wynosi: " + currencyFormat(balance));

        } catch (SQLException e) {
            System.out.println("Database connection failed" + e.getMessage());
        }

    }
    Connection connect(String username, String password) throws SQLServerException {
        SQLServerDataSource source = new SQLServerDataSource();
        source.setUser(username);
        source.setPassword(password);
        source.setServerName("morfeusz.wszib.edu.pl");
        source.setPortNumber(1433);
        source.setDatabaseName(username);
        source.setTrustServerCertificate(true);

        return source.getConnection();
    }

    public static String currencyFormat(BigDecimal n) {
        return NumberFormat.getCurrencyInstance().format(n);
    }
}
