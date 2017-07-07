package ex4_inc;

/**
 * Created by ЗВЕРЬ-МАШИНА on 27.05.2017.
 */
public class Date {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if (day> 0 && day <32) {
            this.day = day;
        }
    }


    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

