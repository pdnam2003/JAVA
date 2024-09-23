
public enum Gender {
    M("Male"),F("Female");
    private String genderLabel;
    Gender(String genderLabel){
        this.genderLabel = genderLabel;
    }
    public void setGenderLabel(String genderLabel){
        this.genderLabel = genderLabel;
    }
}
