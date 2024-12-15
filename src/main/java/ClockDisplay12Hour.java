package src.main.java;

public class ClockDisplay12Hour extends ClockDisplay {
    private String ampm;  // "AM" or "PM"

    public ClockDisplay12Hour() {
        super();  // Call the parent constructor
        ampm = "AM";  // Default to AM
    }

    public ClockDisplay12Hour(int hour, int minute) {
        super(hour, minute);
        ampm = (hour >= 12) ? "PM" : "AM";  // Set AM/PM based on the hour
    }

    @Override
    public void setTime(int hour, int minute) {
        super.setTime(hour, minute);
        // Set AM/PM based on the hour
        if (hour >= 12) {
            ampm = "PM";
        } else {
            ampm = "AM";
        }
        if (hour > 12) {  // Adjust hour if it's greater than 12
            hour -= 12;
        }
    }

    @Override
    public String readTime() {
        // Get the time from the super class and append AM/PM
        String time = super.readTime();
        int hour = Integer.parseInt(time.split(":")[0]);
        if (hour == 0) {
            hour = 12;  // Convert 0 hour to 12 for 12-hour format
        }
        if (hour > 12) {
            hour -= 12;  // Adjust hour for 12-hour format
        }
        return String.format("%02d:%s %s", hour, time.split(":")[1], ampm);
    }

    @Override
    public void tick() {
        super.tick();
        // Change AM/PM when hour reaches 12 (12:00 to 12:01)
        if (getHours().getValue() == 12 && getMinutes().getValue() == 0) {
            ampm = ampm.equals("AM") ? "PM" : "AM";  // Toggle AM/PM
        }
    }
}
