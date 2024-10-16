package Controller;

import Entity.Account;
import Entity.Gender;
import Service.AccountService;

import java.util.List;

public class AccountController {
    public static AccountService ac;
    public static List<Account> accounts ;
    public AccountController(List<Account> accounts, AccountService ac) {
        AccountController.accounts = accounts;
        this.ac = ac;
    }
    public static Account getById(int Id) {
        Account accounts = (Account) ac.getById(Id);
        if (accounts != null) {
            return accounts;
        }else{
            return null;
        }

    }
    public static Account getByName(String Name) {
        Account accounts = (Account) ac.getByName(Name);
        if (accounts != null) {
            return accounts;
        }else {
            return null;
        }
    }
    public static Account getByGender(Gender gender) {
        Account accounts = (Account) ac.getByGender(gender);
       if (accounts != null) {
           return accounts;
       }else {
           return null;
       }
    }
}
