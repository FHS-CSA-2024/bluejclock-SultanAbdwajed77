
public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;

    public ClockDisplay() {
        hours = new NumberDisplay(24); // Hours range from 0 to 23
        minutes = new NumberDisplay(60); // Minutes range from 0 to 59
    }

    public ClockDisplay(int hour, int minute) {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    public void setTime(int hour, int minute) {
        if (hour >= 0 && hour < 24) {
            hours.setValue(hour);
        }
        if (minute >= 0 && minute < 60) {
            minutes.setValue(minute);
        }
    }

    public String readTime() {
        return hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

    public void tick() {
        minutes.increment();
        if (minutes.getValue() == 0) {
            hours.increment();
        }
    }
}
