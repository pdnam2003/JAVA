package Service;

import Entity.Account;
import Entity.Gender;
import Global.Global;
import IGeneric.IGenneral;

import java.lang.foreign.Linker;
import java.util.List;
import java.util.Optional;

public class AccountService implements IGenneral<Account> {
    private List<Account> accounts;
    public AccountService(List<Account> accounts) {
        this.accounts = accounts;
    }




    @Override
    public Account getById(int id) {
        Optional<Account> account = accounts.stream()
                .filter(a->a.getId()==id)
                .findFirst();
        return account.orElse(null);
    }

    @Override
    public Account getByCode(String code) {
        return null;
    }

    @Override
    public List<Account> getByName(String Keyword) {
        return List.of();
    }


    public Account getAccountByCustomerCode(String code) {
        return accounts.stream()
                .filter(a->a.getCustomer().getCode().equalsIgnoreCase(code))
                .findFirst().orElse(null);
    }


    public List<Account> getAccountByCustomerName(String Keyword) {
        return accounts.stream()
                .filter(a->Global.ignoreCase(a.getCustomer().getName(),Keyword))
                .toList();
    }

    public List<Account> getAccountsByCustomer( ) {
        return accounts.stream()
                .filter(a->a.getCustomer().getGender()== Gender.M)
                .filter(a->a.getBalance()>1000000)
                .toList();
    }
}
