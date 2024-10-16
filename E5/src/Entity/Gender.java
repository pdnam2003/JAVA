package Entity;

public enum Gender {
    M("Male"),F("Female"),G("Gay");
    private String genderLabel;
    Gender(String gender) {
        this.genderLabel = gender;
    }

    public void setGenderLabel(String gender) {
        this.genderLabel = genderLabel;
    }
}
