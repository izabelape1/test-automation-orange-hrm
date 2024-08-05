package enums;

public enum TypeOfMembership {
    ACCA("ACCA"),
    BRITISH_COMPUTER_SOCIETY("British Computer Society"),
    CHARTERED_INSTITUTE_OF_MARKETING("Chartered Institute of Marketing"),
    CIMA("CIMA");

    private final String description;

    TypeOfMembership(String description) {
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