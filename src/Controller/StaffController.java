package Controller;

import Entity.Staff;
import Service.StaffService;


import java.util.List;

public class StaffController {
    public static StaffService ss;
    public StaffController(List<Staff>staffs,StaffService ss){
        this.ss=ss;
    }
    public static Staff getById(int id){
        Staff staff= ss.getById(id);
        if(staff!=null){
            return staff;
        }
        return null;
    }
}
