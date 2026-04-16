public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public static void main(String[] args) {
        Time time1 = new Time(10, 15, 30);

        time1.addSeconds(3665);

        time1.display12HourFormat();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Година не може бути менше нуля чи більше 23!");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Хвилина не може бути менше 0 чи більше 59!");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Секунда не може бути менше 0 чи більше 59!");
        }
    }

    public void addSeconds(int sec) {
        if (sec > 0) {
            int totalSeconds = second + sec;
            second = totalSeconds % 60;

            int extraMinutes = totalSeconds / 60;
            int totalMinutes = minute + extraMinutes;
            minute = totalMinutes % 60;

            int extraHours = totalMinutes / 60;
            hour = (hour + extraHours) % 24;
        } else {
            throw new IllegalArgumentException("Значення має бути більше 0!");
        }
    }

    public void display12HourFormat() {
        int h = (hour % 12 == 0) ? 12 : hour % 12;
        String period = (hour < 12) ? "AM" : "PM";

        System.out.printf("%02d:%02d:%02d %s%n", h, minute, second, period);
    }
}
