import Controller.AccountController;
import Controller.CustomerController;
import Entity.Account;
import Entity.Customer;
import Entity.Gender;
import Entity.Invoice;
import Service.AccountService;
import Service.CustomerService;
import Service.InvoiceService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<Customer>();
        List<Account> accounts = new ArrayList<Account>();
        List<Invoice> invoices = new ArrayList<Invoice>();

        CustomerService cs = new CustomerService(customers);
        CustomerController customerController = new CustomerController(customers, cs);

        AccountService as = new AccountService(accounts);
        AccountController ac = new AccountController(accounts, as);

        InvoiceService ic = new InvoiceService(invoices);
        InvoiceService invoiceService = new InvoiceService(invoices);

        customers.add(new Customer(1, "hung", Gender.M, 15.0));
        customers.add(new Customer(2, "Jane Smith", Gender.F, 10.));
        customers.add(new Customer(3, "Alex Taylor", Gender.F, 5));
        customers.add(new Customer(4, "Michael Brown", Gender.M, 20.0));
        customers.add(new Customer(3, "Clex Taylor", Gender.G, 0.0));

        invoices.add(new Invoice(1, customers.get(0), 250.75, LocalDate.now()));
        invoices.add(new Invoice(2, customers.get(1), 500.00, LocalDate.of(2024, 10, 15)));
        invoices.add(new Invoice(3, customers.get(2), 100.50, LocalDate.of(2024, 10, 10)));
        invoices.add(new Invoice(4, customers.get(3), 1500.99, LocalDate.of(2024, 9, 30)));
        invoices.add(new Invoice(5, customers.get(4), 55.25, LocalDate.now()));

        accounts.add(new Account(1, customers.get(0), 1000.50));
        accounts.add(new Account(2, customers.get(1), 2500.75));
        accounts.add(new Account(3, customers.get(2), 500.00));
        accounts.add(new Account(4, customers.get(3), 100.20));
        accounts.add(new Account(5, customers.get(4), 750.00));

//        System.out.println("sap xep theo ten:");
//        List<Customer> sortCustomer = customers.stream()
//                .sorted(Comparator.comparing(Customer::getName))
//                .toList();
//        sortCustomer.forEach(System.out::println);
//

        System.out.println("tim account Id tu ban phim ");
        System.out.println("nhap Id : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Account> searchIdAccounts = accounts.stream()
                .filter(a -> a.getId() == Integer.parseInt(input))
                .collect(Collectors.toList());
        if (!searchIdAccounts.isEmpty()) {
            searchIdAccounts.forEach(System.out::println);
        } else {
            System.out.println("sai Id ");
        }

        System.out.println("tim invoice theo Name");
        System.out.println("nhap Name : ");
        Scanner scanner1 = new Scanner(System.in);
        String input2 = scanner1.nextLine();
        List<Invoice> searchInvoice = invoices.stream()
                .filter(i -> i.getCustomer().getName().equalsIgnoreCase(input2))
                .collect(Collectors.toList());
        if (!searchInvoice.isEmpty()) {
            searchInvoice.forEach(System.out::println);
        } else {
            System.out.println("khong thay Name ");
        }

//        Liệt kê thông tin khách hàng đủ thanh toán cho hóa đơn(Invoice) theo số tiền phải trả(amount) đã giảm trừ theo %discount
        System.out.println("Danh sách khách hàng đủ khả năng thanh toán hóa đơn:");
//        invoices.stream()
//                .filter(i->i.getAmountAfterDiscount()  )
//                .forEach(invoice -> {
//                    System.out.println(invoice+ Customer;
//                });


    }
}