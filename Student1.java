
package pkg1505042_observer;


public class Student1 extends Observer{
    public Student1(Subject cr) {
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
        System.out.println("In Student 1: "+this.cr.receiveMsg());
    }
    
}
