package org.acme;

import org.acme.services.InvoiceService;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

//        InvoiceService invoiceService = new InvoiceService();
//        invoiceService.generateInvoice();

        Class klass = Class.forName("org.acme.services.InvoiceService");
        Constructor constructor = klass.getDeclaredConstructor();
        Object  o = constructor.newInstance();

        System.out.println(o);

        Method m = klass.getDeclaredMethod("generateInvoice");
        m.setAccessible(true);
        m.invoke(o);
    }
}