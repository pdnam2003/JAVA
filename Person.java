package Entity ;
public class Person {
     public String name;
     public String address;

     public Person(){;};
     public Person(String name, String address) {
         this.name = name;
         this.address = address;
     }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
