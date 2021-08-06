package integration.constants;

public enum Gender {
    MALE("male"),
    FEMALE("female");

    private final String type;

    Gender(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }
}
