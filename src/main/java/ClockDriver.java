
public class ClockDriver {
    public static void main(String[] args) {
        // Test ClockDisplay
        System.out.println("ClockDisplay Tests:");
        ClockDisplay clock = new ClockDisplay();
        System.out.println("Initial time: " + clock.readTime());
        clock.setTime(3, 32);
        System.out.println("Set time to 03:32: " + clock.readTime());
        clock.tick();
        System.out.println("After tick: " + clock.readTime());
        clock.setTime(1, 59);
        clock.tick();
        System.out.println("After tick 01:59 to 02:00: " + clock.readTime());
        clock.setTime(23, 59);
        clock.tick();
        System.out.println("After tick 23:59 to 00:00: " + clock.readTime());

        // Test ClockDisplaySeconds
        System.out.println("\nClockDisplaySeconds Tests:");
        ClockDisplaySeconds clockSeconds = new ClockDisplaySeconds();
        System.out.println("Initial time: " + clockSeconds.readTime());
        clockSeconds.setTime(3, 32, 59);
        System.out.println("Set time to 03:32:59: " + clockSeconds.readTime());
        clockSeconds.tick();
        System.out.println("After tick 03:32:59 to 03:33:00: " + clockSeconds.readTime());
        clockSeconds.setTime(1, 59, 59);
        clockSeconds.tick();
        System.out.println("After tick 01:59:59 to 02:00:00: " + clockSeconds.readTime());

        // Test ClockDisplay12Hour (Challenge)
        System.out.println("\nClockDisplay12Hour Tests:");
        ClockDisplay12Hour clock12Hour = new ClockDisplay12Hour();
        clock12Hour.setTime(3, 32);
        System.out.println("Set time to 03:32 AM: " + clock12Hour.readTime());
        clock12Hour.tick();
        System.out.println("After tick 03:32 AM to 03:33 AM: " + clock12Hour.readTime());
        clock12Hour.setTime(11, 59);
        clock12Hour.tick();
        System.out.println("After tick 11:59 AM to 12:00 PM: " + clock12Hour.readTime());
    }
}
