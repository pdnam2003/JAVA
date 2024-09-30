import Entity.Account;
import Entity.Customer;
import Entity.Gender;
import Entity.Invoice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Chi", 1003, Gender.Male, 10));
        customers.add(new Customer("An", 1001, Gender.Female, 20));
        customers.add(new Customer("Binh", 1005, Gender.Female, 20));
        customers.add(new Customer("Lan", 1006, Gender.Female, 15));
        customers.add(new Customer("Minh", 1002, Gender.Male, 5));

        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1, "An", 1001, Gender.Female, 20, 1000));
        accounts.add(new Account(2, "Chi", 1003, Gender.Male, 10, 2000));
        accounts.add(new Account(3, "Binh", 1005, Gender.Female, 20, 3000));
        accounts.add(new Account(4, "Lan", 1006, Gender.Female, 15, 4000));
        accounts.add(new Account(5, "Minh", 1002, Gender.Male, 5, 500));

        List<Invoice> invoices = new ArrayList<>();
        invoices.add(new Invoice(1, "Chi", 1003, Gender.Male, 10, 3000, LocalDate.of(2023, 1, 15)));
        invoices.add(new Invoice(2, "Minh", 1002, Gender.Male, 5, 4000, LocalDate.of(2023, 8, 20)));
        invoices.add(new Invoice(3, "Binh", 1005, Gender.Female, 20, 2500, LocalDate.of(2023, 8, 10)));
        invoices.add(new Invoice(4, "An", 1001, Gender.Female, 20, 5000, LocalDate.of(2023, 4, 5)));
        invoices.add(new Invoice(5, "Lan", 1006, Gender.Female, 15, 3500, LocalDate.of(2023, 5, 25)));


        Scanner sc=new Scanner(System.in);


    }
}