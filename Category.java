public class Category extends Goal {
    private String name;

    public Category(String name, double targetAmount, double currentAmount) {
        super(targetAmount, currentAmount);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
