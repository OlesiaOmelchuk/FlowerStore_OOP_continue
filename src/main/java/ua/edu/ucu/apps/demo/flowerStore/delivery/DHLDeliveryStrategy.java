package ua.edu.ucu.apps.demo.flowerStore.delivery;

import java.util.LinkedList;

public class DHLDeliveryStrategy implements Delivery{

    @Override
    public void deliver(LinkedList items) {
        System.out.println("Order was delivered by DHL delivery");
    }
}
