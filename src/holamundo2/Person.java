/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo2;

/**
 *
 * @author usuario
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class Person {

    private final String name;
    private final String surname;
    private final Calendar birthday;
    private long MILESECOND_PER_YEAR;

    public Person(String name, String surname, Calendar birthday) {
        this.MILESECOND_PER_YEAR = (long) (1000 * 60 * 60 * 24 * 365.25);
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public int getAge() {
        Calendar today;
        today = GregorianCalendar.getInstance();
        

        return (int) (today.getTimeInMillis() - birthday.getTimeInMillis());

    }
    private long getmillis (long milli){
       return milli/MILESECOND_PER_YEAR;
    }
}