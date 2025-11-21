package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<IObserver> observers = new ArrayList<>();

    private String productName;
    private int productPrice;
    private String availability;

    public String GetAvailability()
    {
        return availability;
    }

    public void SetAvailability(String availability)
    {
        this.availability = availability;
        System.out.println("Availability changed from Out of Stock to Available.");
        NotifyObservers();
    }

    public void RegisterObserver(IObserver observer)
    {
        System.out.println("Observer Added : " + ((ConcreteObserver)observer).getUserName());
        observers.add(observer);
    }

    public void RemoveObserver(IObserver observer)
    {
        System.out.println("Observer Removed : " + ((ConcreteObserver)observer).getUserName());
        observers.remove(observer);
    }

    public void NotifyObservers()
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
