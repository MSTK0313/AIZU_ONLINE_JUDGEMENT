import java.util.Scanner;

class ITP1_1_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Integer parameter = Integer.valueOf(input);
        scanner.close();

        System.out.println(exchangeXToHours(parameter)+":"+exchangeXToMinutes(parameter)+":"+exchangeXToSeconds(parameter));
    }

    public static Integer exchangeXToHours(Integer x) {
        Integer hours = x/(60*60);
        return hours;
    }

    public static Integer exchangeXToMinutes(Integer x) {
        Integer minutes = x/60%60;
        return minutes;
    }

    public static Integer exchangeXToSeconds(Integer x) {
        Integer seconds = x%60;
        return seconds;
    }
}
