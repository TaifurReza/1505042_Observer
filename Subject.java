
package pkg1505042_observer;


import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private String state;

    public String receiveMsg() {
        return state;
    }

    public void sendMsg(String state) {
        this.state = state;
        NotifyAll();
    }
    
    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    private void NotifyAll() {
        observers.forEach((observer) -> {
            observer.NotifyAll();
        });
    }
}

