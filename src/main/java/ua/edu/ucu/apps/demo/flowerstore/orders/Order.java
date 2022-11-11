package ua.edu.ucu.apps.demo.flowerstore.orders;

import ua.edu.ucu.apps.demo.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.demo.flowerstore.flowers.Item;
import ua.edu.ucu.apps.demo.flowerstore.payments.Payment;

import java.util.LinkedList;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item : items) {
            price += item.price();
        }
        return price;
    }

    public void processOrder() {
        System.out.println("Processing order...");
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
