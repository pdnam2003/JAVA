package Service;

import Entity.Customer;
import Entity.Gender;
import Entity.Invoice;
import IGeneric.IGeneral;

import java.util.List;
import java.util.Optional;

public class InvoiceService implements IGeneral<Invoice> {
        private List<Invoice> invoices;
        public InvoiceService() {;}
        public InvoiceService(List<Invoice> invoices) {
            this.invoices = invoices;
        }


    @Override
    public Customer getById(int Id) {
        Optional <Invoice> invoice = invoices.stream().filter(i -> i.getId() == Id).findFirst();
        return invoice.orElse(null);
    }

    @Override
    public Customer getByName(String Name) {
        Optional <Invoice> invoice = invoices.stream().filter(i -> i.getName() == Name).findFirst();
        return invoice.orElse(null);
    }

    @Override
    public Customer getByGender(Gender gender) {
        Optional <Invoice> invoice = invoices.stream().filter(i -> i.getGender() == gender).findFirst();
        return invoice.orElse(null);
    }
}
