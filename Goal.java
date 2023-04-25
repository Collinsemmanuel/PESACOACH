public abstract class Goal {
    private String name;
    private double targetAmount;
    private double savedAmount;

    public Goal(String name, double targetAmount, double savedAmount) {
        this.name = name;
        this.targetAmount = targetAmount;
        this.savedAmount = savedAmount;
    }

    public String getName() {
        return name;
    }

    public double getTargetAmount() {
        return targetAmount;
    }

    public double getSavedAmount() {
        return savedAmount;
    }

    public void setSavedAmount(double savedAmount) {
        this.savedAmount = savedAmount;
    }

    public abstract double calculateProgress();

    public abstract void addAmount(double amount);
}
