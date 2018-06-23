
package pkg1505042_observer;

public class Student2 extends Observer{
    public Student2(Subject cr) {
        this.cr=cr;
    }
    
    @Override
    public void attach(){
        this.cr.add(this);
    }