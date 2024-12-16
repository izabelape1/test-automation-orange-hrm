package enums;

public enum Vacancy {
    JUNIOR_ACCOUNT_ASSISTANT("Junior account assistant"),
    PAYROLL_ADMINISTRATOR("Payroll administrator"),
    SALES_REPRESENTATIVE("Sales representative"),
    SENIOR_QE_LEAD("Senior QA lead"),
    SENIOR_SUPPORT_SPECIALIST("Senior support specialist"),
    SOFTWARE_ENGINEER("Software specialist"),
    TEST("Test");

    private final String description;

    Vacancy(String description) {
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