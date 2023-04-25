public class Budget {
    private double income;
    private double expenses;
    private double savings;
    
    public Budget(double income, double expenses, double savings) {
        this.income = income;
        this.expenses = expenses;
        this.savings = savings;
    }
    
    // getters and setters
    public double getIncome() {
        return income;
    }
    
    public void setIncome(double income) {
        this.income = income;
    }
    
    public double getExpenses() {
        return expenses;
    }
    
    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }
    
    public double getSavings() {
        return savings;
    }
    
    public void setSavings(double savings) {
        this.savings = savings;
    }
}
