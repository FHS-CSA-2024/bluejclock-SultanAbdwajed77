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

    public void setTime(int hour, int minute, int second) {
        super.setTime(hour, minute);  // Set hours and minutes using the parent class
        if (second >= 0 && second < 60) {
            seconds.setValue(second);
        }
    }

    @Override
    public String readTime() {
        return super.readTime() + ":" + seconds.getDisplayValue();
    }

    @Override
    public void tick() {
        seconds.increment();
        if (seconds.getValue() == 0) {
            super.tick();  // Call tick of parent class if seconds reset to 0
        }
    }
}
