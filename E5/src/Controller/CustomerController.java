package Controller;

import Entity.Customer;
import Entity.Gender;
import Service.CustomerService;

import java.util.List;

public class CustomerController  {
    public static CustomerService cs;
 private static List<Customer> customers;
 public CustomerController(List<Customer> customers, CustomerService cs) {
     CustomerController.customers = customers;
     this.cs= cs;
 }
 public static Customer getById(int Id) {
     Customer customers = cs.getById(Id);
     if (customers != null) {
         return customers;
     }else {
     return null;}
 }
 public static Customer getByName(String Name) {
     Customer customer = cs.getByName(Name);
     if (customer != null) {
         return customer;
     }else{
     return null;}

 }
 public static Customer getByGender(Gender gender) {
     Customer customer = cs.getByGender(gender);
     if (customer != null) {
         return customer;
     }else{
     return null;}

 }
 }


