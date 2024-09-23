
public class Author {
    private String name;
    private String email;
    private  Gender gender;

    public Author() {
        System.out.println("Author Constructor :");
    }

    public Author(String name, String email, Gender gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
