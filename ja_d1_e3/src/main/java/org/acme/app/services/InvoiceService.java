package org.acme.app.services;

import org.acme.app.repositories.InvoiceRepository;
import org.acme.framework.annotations.Call;
import org.acme.framework.annotations.Inject;

public class InvoiceService {

    @Inject
    private InvoiceRepository invoiceRepository;

    private String str;

    @Call(repeat = 3)
    public void storeInvoice() {
        invoiceRepository.storeInvoice();
    }

    public void otherMethod() {
        System.out.println("Other method");
    }

    @Call
    public void callThisOnce() {
        System.out.println("Only once");
    }
}
