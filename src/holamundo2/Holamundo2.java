/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class Holamundo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Person p1;
        Calendar f1;
        f1 = GregorianCalendar.getInstance();
        f1.set(1995,7,15);
               
        
        p1 = new Person("Renato", "Sosa", f1);
        System.out.println(p1.getBirthday());
        System.out.println(p1.getFullName());
        System.out.println(p1.getAge());
    }
}
