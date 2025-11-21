package org.example.Observer;

public class ConcreteObserver implements IObserver {
    private String userName;

    public ConcreteObserver(String userName) {
        this.userName = userName;
        // Your code goes here... make sure to add this features:
        //1. Allow to hold the observer's name (e.g. when user Adam wants to observe the subject)
        //2. Creating the Observer
        //3. Registering the Observer with the Subject
        //4. Removing the Observer from the Subject
        //5. Observer will get a notification from the Subject using the following Method
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void addSubscriber(ISubject subject) {
        subject.registerObserver(this);
    }

    public void removeSubscriber(ISubject subject) {
        subject.removeObserver(this);
    }

    @Override
    public void update(String availability) {
        System.out.println("The: " + userName + " has updated: " + availability);
    }
}

