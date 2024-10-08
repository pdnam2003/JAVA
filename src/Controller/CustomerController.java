package Controller;

import Entity.Customer;
import Service.Customerservice;

public class CustomerController {
    private static Customerservice cs;
    public CustomerController(Customerservice cs){
        this.cs = cs;
    }
    public  static Customer getById(int id){
        Customer customer = cs.getById(id);
        if(customer != null){
            return customer;
        }
        return null ;
    }
}
