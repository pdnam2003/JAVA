package Service;

import Entity.Account;
import Entity.Customer;
import Entity.Gender;
import IGeneric.IGeneral;



import java.util.List;
import java.util.Optional;


public class AccountService implements IGeneral<Account> {
    private List<Account> accounts;
    public AccountService() {;}
    public AccountService(List<Account> accounts) {
        this.accounts = accounts;
    }


    @Override
    public Customer getById(int Id) {
        Optional<Account> account = accounts.stream()
                .filter(a -> a.getId() == Id)
                .findFirst();
        return account.orElse(null);
    }

    @Override
    public Customer getByName(String Name) {
      Optional<Account> account = accounts.stream()
              .filter(a->a.getName() ==  Name)
              .findFirst();
      return account.orElse(null);
    }

    @Override
    public Customer getByGender(Gender gender) {
       Optional<Account> account = accounts.stream()
               .filter(a-> a.getGender() == gender )
               .findFirst();
       return account.orElse(null);
    }
}
