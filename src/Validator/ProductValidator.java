package Validator;

import Entity.Product;

import java.util.regex.Pattern;

public class ProductValidator {
    private static final Pattern Id = Pattern.compile("^(MS|NE|SE)[0-9]+$");
    private static final Pattern Name = Pattern.compile("[a-zA-Z]+$");

    public static boolean validate(Product product){
        if (product.getId()== null || !Id.matcher(product.getId()).matches()){
            System.out.println("\"Invalid Product ID. It should start with MS, NE, or SE followed by numbers.");
        return  false;
        }
        if (product.getName()==null || !Name.matcher(product.getName()).matches()){
            System.out.println("Invalid Product Quantity. Quantity cannot be negative.");
            return  false;
        }
        return true;
    }
}
