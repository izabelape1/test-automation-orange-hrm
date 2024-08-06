package enums;

public enum UserStatus {
    ENABLED("Enabled"),
    DISABLED("Disabled");

    private final String description;

    UserStatus(String description) {
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