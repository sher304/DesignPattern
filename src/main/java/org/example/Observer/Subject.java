package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
    private List<IObserver> observers = new ArrayList<>();

    private String productName;
    private int productPrice;
    private String availability;

    public Subject(String productName, int productPrice, String availability) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.availability = availability;
    }

    public String getAvailability()
    {
        return availability;
    }

    public void setAvailability(String availability)
    {
        this.availability = availability;
        System.out.println("Availability changed from Out of Stock to Available.");
        notifyObservers();
    }

    public void registerObserver(IObserver observer)
    {
        System.out.println("Observer Added : " + ((ConcreteObserver)observer).getUserName());
        observers.add(observer);
    }

    public void removeObserver(IObserver observer)
    {
        System.out.println("Observer Removed : " + ((ConcreteObserver)observer).getUserName());
        observers.remove(observer);
    }

    public void notifyObservers()
    {
        System.out.println("Product Name :"
                + productName + ", product Price : "
                + productPrice + " is Now available. So, notifying all Registered users ");

        System.out.println();
        for (IObserver observer: observers) {
            observer.update(availability);
        }
    }
}
