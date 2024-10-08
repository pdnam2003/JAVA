package Service;

import Entity.Customer;
import Global.Global;
import IGeneric.IGeneral;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Customerservice implements IGeneral<Customer> {
    private List<Customer> customers;
    public Customerservice(List<Customer> customers){
        this.customers = customers;
    }

    public Customer getById(int id) {
        Optional<Customer> customer = customers.stream()
                .filter(c->c.getId()==id)
                .findFirst();
        return customer.orElse(null);
    }

    @Override
    public List<Customer> getByName(String Keyword) {
       return customers.stream()
               .filter(c-> Global.ignoreCase(c.getName(),Keyword))
               .toList();
    }

}
