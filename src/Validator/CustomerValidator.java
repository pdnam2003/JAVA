package Validator;

import Entity.Customer;

import java.util.regex.Pattern;

public class CustomerValidator {
    private static final Pattern Name = Pattern.compile("[a-zA-Z] {3,50}");
    private static final Pattern Id = Pattern.compile("[0-9]+$");

    public static  boolean validate(Customer customer){
        if (customer.getName() == null || !Name.matcher(customer.getName()).matches()){
            System.out.println("only contains character[a-zA-Z]{3,50} and backspace");
        }
        return true;
    }
}
