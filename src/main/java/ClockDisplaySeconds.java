public class ClockDisplaySeconds extends ClockDisplay {
    private NumberDisplay seconds;

    public ClockDisplaySeconds() {
        super();
        seconds = new NumberDisplay(60); // Seconds range from 0 to 59
    }

    public ClockDisplaySeconds(int hour, int minute, int second) {
        super(hour, minute);
        seconds = new NumberDisplay(60);
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        super.setTime(hour, minute);
        if (second >= 0 && second < 60) {
            seconds.setValue(second);
        }
    }

    public String readTime() {
        return super.readTime() + ":" + seconds.getDisplayValue();
    }

    public void tick() {
        seconds.increment();
        if (seconds.getValue() == 0) {
            super.tick();
        }
    }
}
