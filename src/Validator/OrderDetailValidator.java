package Validator;

import Entity.OrderDetail;

import java.util.regex.Pattern;

public class OrderDetailValidator {
    public static  final Pattern Quantity = Pattern.compile("^[0-9]+$");
    public  static  boolean Validate(OrderDetail orderDetail) {
        if( orderDetail.getQuantity() != null || Quantity.matcher(orderDetail.getQuantity()).matches()){
            return false;
        }
        return true;
    }
}
