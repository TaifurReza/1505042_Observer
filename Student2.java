
package pkg1505042_observer;

public class Student2 extends Observer{
    public Student2(Subject cr) {
        this.cr=cr;
    }
    
    @Override
    public void attach(){
        this.cr.add(this);
    }
    @Override
    public void detach(){
        this.cr.remove(this);
    }
    
    @Override
    public void NotifyAll() {
        System.out.println("In Student 2: "+this.cr.receiveMsg());
    }
    
}