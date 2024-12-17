package src.main.java;

public class ClockDisplaySeconds extends ClockDisplay {
    private NumberDisplay seconds;

    public ClockDisplaySeconds() {
        super();  // Call the ClockDisplay constructor
        seconds = new NumberDisplay(60); // Seconds range from 0 to 59
    }

    public ClockDisplaySeconds(int hour, int minute, int second) {
        super(hour, minute);  // Call the ClockDisplay constructor
        seconds = new NumberDisplay(60);
        setTime(hour, minute, second);
    }

   
