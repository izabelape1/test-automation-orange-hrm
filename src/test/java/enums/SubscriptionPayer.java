package enums;

public enum SubscriptionPayer {
    COMPANY("Company"),
    INDIVIDUAL("Individual");

    private final String description;

    SubscriptionPayer(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}