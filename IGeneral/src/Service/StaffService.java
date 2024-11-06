package Service;

import Entity.Staff;
import Global.Global;
import IGeneric.IGenneral;

import java.util.List;
import java.util.Optional;

public class StaffService implements IGenneral<Staff> {
    private  List<Staff> staffs;
    public StaffService(List<Staff> staffs) {
        this.staffs = staffs;
    }

    @Override
    public Staff getById(int id) {
        Optional<Staff> staff = staffs.stream()
                .filter(s->s.getId()==id)
                .findFirst();
        return staff.orElse(null);
    }

    @Override
    public Staff getByCode(String code) {
       Optional<Staff> staff = staffs.stream()
               .filter(s -> s.getCode().equalsIgnoreCase(code))
               .findFirst();
       return staff.orElse(null);
    }

    @Override
    public List<Staff> getByName(String Keyword) {
        return   staffs.stream()
                .filter(s-> Global.ignoreCase(s.getName(),Keyword) )
                .toList();

    }



}
