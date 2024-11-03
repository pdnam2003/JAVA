package Entity;

public enum Gender {
    M("Male"),F("Female");
    private String genderLabel;
    Gender() {}
    Gender(String gender) {
        this.genderLabel = gender;
    }
       public String getGenderLabel() {
        return genderLabel;
    }
    public void setGenderLabel(String genderLabel) {
        this.genderLabel = genderLabel;
    }
}
