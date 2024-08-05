package enums;

public enum MaritalStatus {
    SINGLE("Single"),
    MARRIED("Married"),
    OTHER("Other");

    private final String description;

    MaritalStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}