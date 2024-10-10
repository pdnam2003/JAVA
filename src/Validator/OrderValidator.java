package Validator;

import Entity.Order;
import java.util.regex.Pattern;

public class OrderValidator {
    private static final Pattern Id = Pattern.compile("(ORDPM)[0-9]{8}");
    public static boolean validate(Order order) {
        if(order.getId() == null || !Id.matcher(order.getId()).matches()) {
            System.out.println("Invalid Order ID.");
            return false;
        }
        return true;
    }

}
