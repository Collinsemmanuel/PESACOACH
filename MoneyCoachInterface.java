public interface MoneyCoachInterface {
    
    // Method to create a new user
    public User createUser(String name, String email, String password);
    
    // Method to log in a user
    public boolean login(String email, String password);
    
    // Method to create a new budget
    public Budget createBudget(String name, double amount, String startDate, String endDate);
    
    // Method to add a transaction to a budget
    public void addTransaction(Budget budget, Transaction transaction);
    
    // Method to create a new account
    public Account createAccount(String name, String type, double balance);
    
    // Method to add an account to a user
    public void addAccount(User user, Account account);
    
    // Method to get the total balance of all accounts
    public double getTotalBalance(User user);
    
    // Method to create a new goal
    public Goal createGoal(String name, double amount, String dueDate);
    
    // Method to add a goal to a user
    public void addGoal(User user, Goal goal);
    
    // Method to create a new category
    public Category createCategory(String name);
    
    // Method to add a category to a transaction
    public void addCategory(Transaction transaction, Category category);
    
    // Method to create a new envelope
    public Envelope createEnvelope(String name, double amount);
    
    // Method to add an envelope to a budget
    public void addEnvelope(Budget budget, Envelope envelope);
    
    // Method to create a new savings account
    public Savings createSavings(String name, double goalAmount, double currentAmount);
    
    // Method to add a savings account to a user
    public void addSavings(User user, Savings savings);
    
}
