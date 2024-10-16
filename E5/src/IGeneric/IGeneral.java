package IGeneric;
import Entity.Customer;
import Entity.Gender;


public interface IGeneral <T>{
    public Customer getById(int Id);
    public Customer getByName(String Name);
    public Customer getByGender(Gender gender);

}
