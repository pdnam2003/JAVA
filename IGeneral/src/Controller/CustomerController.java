package Controller;


import Entity.Customer;
import Service.CustomerService;

import java.util.List;

public class CustomerController {

    private static CustomerService cs;

    public CustomerController(List<Customer> customers, CustomerService cs) {
        this.cs = cs;

    }
    public static Customer  getById(int id) {
        Customer customer = cs.getById(id);
        if (customer != null) {
            return customer;
        }
        return null;
    }
}
