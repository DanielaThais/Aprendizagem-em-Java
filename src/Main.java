public class Main {
    public static void main(String[] args) {

        Clock brlClock = new BRLClock();

        brlClock.setSecond(0);
        brlClock.setMinute(0);
        brlClock.setHour(15);

        System.out.println(brlClock.getTime());

        System.out.println(new USAClock().convert(brlClock).getTime());

    }
}