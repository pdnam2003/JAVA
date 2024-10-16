package Controller;

import Entity.Gender;
import Entity.Invoice;
import Service.InvoiceService;

import java.util.List;

public class InvoiceController {
    public  static InvoiceService ic;
    public static List<Invoice> controllers;
    public InvoiceController(List<Invoice>invoiceControllers, InvoiceService ic) {
        InvoiceController.controllers = invoiceControllers;
        this.ic = ic;
    }
    public static Invoice getById(int Id) {
        Invoice invoice = (Invoice) ic.getById(Id);
        if (invoice != null) {
            return invoice;
        }else{
            return null;
        }
    }
    public static Invoice getByName(String name) {
        Invoice invoice = (Invoice) ic.getByName(name);
        if (invoice != null) {
            return invoice;
        }else {
            return null;
        }

    }
    public static Invoice getByGender(Gender gender) {
        Invoice invoice = (Invoice) ic.getByGender(gender);
        if (invoice != null) {
            return invoice;
        }else {
            return null;
        }

    }


}
