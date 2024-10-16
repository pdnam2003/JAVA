package Service;

import Entity.Customer;
import Entity.Gender;
import IGeneric.IGeneral;

import java.util.List;
import java.util.Optional;

public class CustomerService implements IGeneral<Customer> {
    private List<Customer> customers;
    public CustomerService() {;}
    public CustomerService(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public Customer getById(int Id) {
        Optional<Customer> customer = customers.stream()
                .filter(c -> c.getId() == Id)
                .findFirst();
        return customer.orElse(null);

    }

    @Override
    public Customer getByName(String Name) {
        Optional<Customer> customer = customers.stream()
                .filter(c->c.getName()==Name)
                .findFirst();
        return customer.orElse(null);

    }

    @Override
    public Customer getByGender(Gender gender) {
        Optional<Customer> customer = customers.stream()
                .filter(c->c.getGender() == gender)
                .findFirst();
        return customer.orElse(null);

    }
}
