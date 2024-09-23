package org.acme.service;

import org.acme.invoicing.InvoicingService;

public class DeliveryService {

    private InvoicingService invoicingService;

    public DeliveryService(InvoicingService invoicingService) {
        this.invoicingService = invoicingService;
    }

    public void deliver() {
        invoicingService.invoice();
    }
}
