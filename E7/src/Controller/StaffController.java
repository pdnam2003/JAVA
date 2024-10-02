package Controller;

import Entity.Staff;
import Service.GetPaidService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public  class StaffController extends GetPaidService {
    private static List<Staff> staffs = new ArrayList<>();

    public StaffController(List<Staff> staffsList) {
        StaffController.staffs = staffsList;
    };

    public void getPaid(String keyword){
        Optional <Staff> searchByName = staffs.stream()
                .filter(s -> s.getName().equalsIgnoreCase(keyword))
                .findFirst();

        if(searchByName.isPresent()){
            Staff staff = searchByName.get(); // Staff == Nam.get();
            double paid = staff.getPaid();
            System.out.println("Paid: " + paid);
        }else{
            System.out.println("Khong tim thay nhan vien ten la: " + keyword);
        }
    }


    public void displayStaff(String keyword){
        Optional <Staff> displayinfo = staffs.stream()
                .filter(d -> d.getName().equalsIgnoreCase(keyword))
                .findFirst();
        if(displayinfo.isPresent()){
            Staff staff = displayinfo.get();
            System.out.println(staff.toString());
        }else {
            System.out.println("Khong tim thay");
        }
    }
    @Override
    public double getPaid() {
        return 0;
    }
}
