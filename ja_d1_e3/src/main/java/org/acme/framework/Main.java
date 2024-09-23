package org.acme.framework;

import org.acme.framework.annotations.Call;
import org.acme.framework.annotations.Inject;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        String invoiceServiceLocation = "org.acme.app.services.InvoiceService";

        Class klass = Class.forName(invoiceServiceLocation);

        Constructor constructor = klass.getDeclaredConstructor();
        Object service = constructor.newInstance();

        Field[] classFields = klass.getDeclaredFields();

        for (Field f : classFields) {
            f.setAccessible(true);

            if (f.isAnnotationPresent(Inject.class)) {
                Class beanKlassName = Class.forName(f.getType().getName());
                Constructor beanConstructor = beanKlassName.getDeclaredConstructor();
                Object beanInstance = beanConstructor.newInstance();

                f.set(service, beanInstance);
            }
        }

        Method[] methods = klass.getDeclaredMethods();
        for (Method m : methods) {
            m.setAccessible(true);

            if (m.isAnnotationPresent(Call.class)) {
                Call call = m.getAnnotation(Call.class);
                int repeat = call.repeat();

                for (int i = 0; i < repeat; i++) {
                    m.invoke(service);
                }
            }
        }
    }
}