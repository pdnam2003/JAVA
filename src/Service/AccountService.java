package Service;

import Entity.Account;
import Entity.Customer;
import Global.Global;
import IGeneric.IGeneral;

import java.util.List;
import java.util.Optional;

public class AccountService implements IGeneral {
    private  List<Account> accounts;
    public AccountService(List<Account>accounts){
        this.accounts = accounts;
    }


    @Override
    public Object getById(int id) {
        Optional<Account> account = accounts.stream()
                .filter(a->a.getId()==id)
                .findFirst();
        return account.orElse(null);
    }



    @Override
    public List getByName(String Keyword) {
        return accounts.stream().filter(a-> Global.ignoreCase(a.getName(),Keyword))
                .toList();
    }
}
