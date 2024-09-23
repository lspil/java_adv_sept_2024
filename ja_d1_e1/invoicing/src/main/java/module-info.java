open module invoicing {

    exports org.acme.invoicing to delivery;
//    opens org.acme to delivery; // doar prin reflection
}