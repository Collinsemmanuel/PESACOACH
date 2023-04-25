public class Savings extends Goal {
    private String name;

    public Savings(String name, double targetAmount, double currentAmount) {
        super(name, targetAmount, currentAmount);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double calculateProgress() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateProgress'");
    }

    @Override
    public void addAmount(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAmount'");
    }
}
