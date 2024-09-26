package org.acme;

public class Order {
    public String productName;
    public int quantity;
    public double pricePerItem;
    public double discount;

    public Order(String productName, int quantity, double pricePerItem, double discount) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
        this.discount = discount;
    }

    public double calculateOrder() {
        if (quantity > 100) {
            discount = 0.20;
        } else if (quantity > 50) {
            discount = 0.10;
        }
        double totalPrice = (pricePerItem * quantity) - (pricePerItem * quantity * discount);
        return totalPrice;
    }

    public void printOrder() {
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: $" + pricePerItem);
        System.out.println("Discount: " + discount * 100 + "%");
        System.out.println("Total price: $" + calculateOrder());
    }
}
