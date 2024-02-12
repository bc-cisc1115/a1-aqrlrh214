public class Time {
    public static void main(String[] args) {
        int hour = 22;
        int minute = 54;
        int second=12;
        int secondsSinceMidnight;
        secondsSinceMidnight=hour*60*60+(minute*60)+second;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);
        int secondsInDay=24*60*60;
        int secondsremainingday=(secondsInDay-secondsSinceMidnight);
        System.out.println("Seconds remaining in the day: " + secondsremainingday);
        double secondsOfTheDay=86400;
        double percentage=(secondsSinceMidnight/secondsOfTheDay)*100;
        System.out.println("Percentage of the day passed: " + percentage + "%");

    }
}
