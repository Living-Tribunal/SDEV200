import java.util.GregorianCalendar;

public class MYDATE {
    GregorianCalendar gregorianCalendar = new GregorianCalendar(); /*creates a new instance of GregorianCalendar with the current date and time in current TZ*/
    private int year; /*data fields */
    private int month;
    private int day;
    
    public MYDATE(){/*A no-arg constructor that creates a MyDate object for the current date */
        System.currentTimeMillis();
    }
    
    public MYDATE(int year, int month, int day){  /*A constructor that constructs a MyDate object with the specified year, month, and day. */
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MYDATE(long elapsedTime){ /*A constructor that constructs a MyDate object with the specified elapsed time in milliseconds. */
        setDate(elapsedTime);
    }
    /*get is used to retriev the year, month, and day of the month from the updated GC object then assigned to the year, month, and day */
    public void setDate(long elapsedTime) {
        gregorianCalendar.setTimeInMillis(elapsedTime);
        this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
        this.month = gregorianCalendar.get(GregorianCalendar.MONTH);
        this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    /*Setter and getters for data fields */
     public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    /* The method takes int day and assigns it to the day field of the object. The method then returns the updated object. */
    /*this keyword refers to the current object */
    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

}





    


