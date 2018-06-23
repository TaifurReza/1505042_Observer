
package pkg1505042_observer;

public class Student3 extends Observer{
    public Student3(Subject cr) {
        this.cr=cr;
    }
    
    @Override
    public void attach(){
        this.cr.add(this);
    }
