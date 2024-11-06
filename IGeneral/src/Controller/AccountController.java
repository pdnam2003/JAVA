package Controller;

import Entity.Account;
import Service.AccountService;

import java.util.List;


public class AccountController {
    private static AccountService as;
    public AccountController(List<Account> accounts, AccountService as) {
        this.as = as;
    }
    public static Account getById(int id) {
        Account account = as.getById(id);
        if (account == null) {
            return account;
        }else {
            return null;
        }

    }

}
