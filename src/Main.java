import Controller.AccountController;
import Controller.CustomerController;
import Controller.StaffController;
import Entity.Account;
import Entity.Customer;
import Entity.Gender;
import Entity.Staff;
import Service.AccountService;
import Service.CustomerService;
import Service.StaffService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<Customer>();
        CustomerService cs = new CustomerService(customers);
        CustomerController customerController = new CustomerController(customers,cs);

        customers.add(new Customer(1,"vvdd","tinh", Gender.F));
        customers.add(new Customer(2,"ccdd","trung",Gender.M));
        Customer cus = CustomerController.getById(1);
//        if(cus != null) {
//            System.out.println(cus);
//        }else{
//            System.out.println("error");
//        }
        List<Staff>staffs = new ArrayList<Staff>();
        StaffService ss = new StaffService(staffs);
        StaffController staffController = new StaffController(staffs,ss);
        staffs.add(new Staff(1,"so1","huhu", LocalDate.of(2000,4,5)));
        staffs.add(new Staff(2,"so2","hehe", LocalDate.of(2003,11,18)));
//
//        if(staffs != null) {
//            System.out.println(staffs);
//        }else {
//            System.out.println("error");
//        }
        List<Account>accounts = new ArrayList<Account>();
        AccountService as = new AccountService(accounts);
        AccountController accountController = new AccountController(accounts,as);
        accounts.add(new Account(1,"acc1", CustomerController.getById(1),2000000,LocalDate.of(2018,10,10)));
        accounts.add(new Account(2,"acc2",CustomerController.getById(2),1000000,LocalDate.of(2015,10,10)));

        if(accounts != null) {
            System.out.println(accounts);
        }else {
            System.out.println("error");
        }




    }
}