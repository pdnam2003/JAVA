package Entity;

public enum Gender {
    M("Male"),F("Female");
    private String genderLabel;
    Gender(String gender){
        this.genderLabel = gender;
    }
    Gender(){;}

    public void setGenderLabel(String genderLabel) {
        this.genderLabel = genderLabel;
    }
}
