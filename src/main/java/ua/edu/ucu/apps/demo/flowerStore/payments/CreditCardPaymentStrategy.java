package ua.edu.ucu.apps.demo.flowerStore.payments;

public class CreditCardPaymentStrategy implements Payment{

    @Override
    public boolean pay(double price) {
        System.out.println("Payment with credit card: ...");
        return true;
    }
}
