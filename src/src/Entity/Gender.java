package Entity;

public enum Gender {
    M("Gender"),F("Female"),G("GAy");
    private String genderLabel;
    Gender(String genderLabel){
        this.genderLabel = genderLabel;
    }
}
