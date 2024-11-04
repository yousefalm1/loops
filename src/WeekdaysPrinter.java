public class WeekdaysPrinter {
    public static void main(String[] args) {

        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for(String day : weekdays) {
            System.out.println(day);
        }


        for (int i = 0; i < weekdays.length; i++) {
            if (i >= 5) break;
            System.out.println(weekdays[i]);
        }
    }
}
