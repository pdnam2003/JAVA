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

 }
}
