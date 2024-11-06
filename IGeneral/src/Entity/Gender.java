package Entity;

public enum Gender {
    M("Male"),F("Female");
    private String genderLabel;
    Gender(String genderLabel) {
        this.genderLabel = genderLabel;
    }
}
