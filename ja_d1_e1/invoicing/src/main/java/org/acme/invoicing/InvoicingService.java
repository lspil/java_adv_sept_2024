package org.acme.invoicing;

import org.acme.invoicing.services.StandardInvoicingService;

public sealed interface InvoicingService permits StandardInvoicingService {

    void invoice();

    static InvoicingService build() {
        return new StandardInvoicingService();
    }
}
