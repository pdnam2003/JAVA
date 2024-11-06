package Service;

import Entity.Customer;
import Global.Global;
import IGeneric.IGenneral;

import java.util.List;
import java.util.Optional;

public class CustomerService implements IGenneral<Customer> {
    private  List<Customer> customers;
    public  CustomerService(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public Customer getById(int id) {
        Optional<Customer> customer = customers.stream()
                .filter(c->c.getId()==id)
                .findFirst();
        return customer.orElse(null);
    }

    @Override
    public Customer getByCode(String code) {
        Optional<Customer> customer = customers.stream()
                .filter(c->c.getCode().equalsIgnoreCase(code))
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
