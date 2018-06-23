
package pkg1505042_observer;

public abstract class Observer {
    protected Subject cr;
    public abstract void attach();
    public abstract void detach();
    public abstract void NotifyAll();
}
