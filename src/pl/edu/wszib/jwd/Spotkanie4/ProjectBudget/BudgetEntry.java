package pl.edu.wszib.jwd.Spotkanie4.ProjectBudget;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BudgetEntry {
    private int id;
    private BigDecimal amount;
    private String entryName;
    private LocalDateTime dateTime;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getEntryName() {
        return entryName;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }
}
