package src.main.java;

public class ClockDisplay12Hour {
    private String ampm;  // "AM" or "PM"

    public ClockDisplay12Hour() {
        super();  // Call the parent constructor
        ampm = "AM";  // Default to AM
    }

    public ClockDisplay12Hour(int hour, int minute) {
        super(hour, minute);
        ampm = (hour >= 12) ? "PM" : "AM";  // Set AM/PM based on the hour
    }

    
