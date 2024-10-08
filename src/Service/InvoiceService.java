package Service;

import Entity.Invoice;
import IGeneric.IGeneral;

import java.util.List;
import java.util.Optional;

public class InvoiceService implements IGeneral {
    private List<Invoice>invoices;
    public InvoiceService(List<Invoice>invoices){
        this.invoices = invoices;
    }

    @Override
    public Invoice getById(int id) {
        Optional<Invoice> invoice = invoices.stream().filter(i->i.getId()==id)
                .findFirst();
        return Invoice.orElse(null);
    }

    @Override
    public List getByName(String Keyword) {
        return null;
    }
}
