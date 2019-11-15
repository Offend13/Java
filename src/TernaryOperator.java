import java.time.LocalDateTime;

public class TernaryOperator {
    public static void main(String[] args) {
        int ora = LocalDateTime.now().getHour();
        int minute = LocalDateTime.now().getMinute();

        String perioada = ora >= 12 ? "PM" : "AM";

        System.out.println(ora + ":" + minute);
        System.out.println(perioada);

        for (int i = 5; i>0; i--) {
            System.out.println(i);
        }
        for (int i = 0, j = 10, u = 25; i<20&&j<30&&u>15; i+=2, j +=4, u--) {
            System.out.println("i:" + i + "j:" + j + "u:" +u);
        }

    }
}
