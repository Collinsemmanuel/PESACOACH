public class Account {
    private String name;
    private double balance;
    private String accountType;
    
    public Account(String name, double balance, String accountType) {
        this.name = name;
        this.balance = balance;
        this.accountType = accountType;
    }
    
    // getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
