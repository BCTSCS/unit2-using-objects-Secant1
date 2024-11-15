public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        day = 4;
        month = 11;
        year = 2024;
    }
    public Date(int mo, int da, int yr){
        month = mo;
        day = da;
        year = yr;
    }
    public int month() {
        return month;
    }
    public int day() {
        return day;
    }
    public int year() {
        return year;
    }

    public String toString() {
        return month+"/"+day+"/"+year;
    }
    public void addYears(int n) {
        year+=n;
    }
    public static Date addCentury(Date newD, Date old) {
        old.addYears(100);
        newD=old;
        return newD;
    }

    public static void main(String[] args) {
        Date oldDate = new Date(1,13,1900);
        Date newD = null;
        newD = addCentury(newD, oldDate);

        System.out.println(oldDate.year);
        System.out.println(newD.year);
        System.out.println(newD);
    }
}
