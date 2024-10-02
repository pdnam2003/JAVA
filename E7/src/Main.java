import Controller.StaffController;
import Entity.Manager;
import Entity.Staff;
import Entity.Technician;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List <Staff> staffs = new ArrayList<Staff>();
        staffs.add(new Manager("Nam" , 1000, 100));
        staffs.add(new Technician("Hieu" , 2000, 200));
        staffs.add(new Manager("Nhi" , 3000, 300));
        StaffController staffController = new StaffController(staffs);

        String input = "Nam";
        staffController.getPaid(input);
        staffController.displayStaff(input);

    }
}