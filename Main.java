import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year = 2022-yearScanner();
        int month = 12-monthScanner();
        int day = dayScanner();
        if(day>9)
        {
            month--;
            day=30-(day-9);
        }
        else {
            day=9-day;
        }
        System.out.println("Поздравляю, вам "+year+" лет, "+month+" месяцев, "+day+" дней.");
    }
    public static int dayScanner() {
        Scanner inpu1 = new Scanner(System.in);
        System.out.println("Введите день рождения: "); int day = inpu1.nextInt();
        if(day<1 || day>31) {
            System.out.print("Неверное число. ");
            dayScanner();
        }
        return day;
    }
    public static int monthScanner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите месяц рождения: "); int month = input.nextInt();
        if(month<1 || month>12) {
            System.out.print("Неверное число. ");
            monthScanner();
        }
        return month;
    }
    public static int yearScanner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите год рождения: "); int year = input.nextInt();
        if(year<1942) {
            System.out.print("Вряд-ли вам столько лет. ");
            yearScanner();
        }
        else if (year>2022) {
            System.out.print("На дворе 2022, не палитесь. ");
            yearScanner();
        }
        return year;
    }
}