
package pkg1505042_observer;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Subject cr=new Subject();
        Student1 std1=new Student1(cr);
        std1.attach();
        Student2 std2=new Student2(cr);
        std2.attach();
        Student3 std3=new Student3(cr);
        std3.attach();
        Scanner scn=new Scanner(System.in);
        cr.sendMsg("No Ct tomorrow\n");

    }
}
