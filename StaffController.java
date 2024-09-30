package Controller;





import Entity.Staff;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StaffController {
 private static List<Staff> staffs;
 public StaffController(List<Staff> staffs) {
     StaffController.staffs = staffs;
 }
 public Optional<Staff> getMaxPay(){
      Optional<Staff> staffMaxPay = StaffController.staffs.stream()
             .max(Comparator.comparing(Staff::getPay));
      return staffMaxPay;
  
public static List<Staff> getByName(String Keyword) {
    return staffs.stream()
            .filter(s -> s.getName().toLowerCase().contains(Keyword.toLowerCase()))
            .collect(Collectors.toList());
}
 public static List<Staff> getById(String Keyword) {
    return staffs.stream()
            .filter(s -> s.getId().toLowerCase().contains(Keyword.toLowerCase()))
            .collect(Collectors.toList());
}

 }
}
