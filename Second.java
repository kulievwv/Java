import java.util.Scanner;
public class Second {
    public Second() {
    }
    public static void main(String[] args) {
        int month = monthScanner();
        int day = dayScanner();
        switch (month) {
            case 1:
                System.out.println("Это зима. ");
                break;
            case 2:
                System.out.println("Это зима. ");
                break;
            case 3:
                System.out.println("Это весна. ");
                break;
            case 4:
                System.out.println("Это весна. ");
                break;
            case 5:
                System.out.println("Это весна. ");
                break;
            case 6:
                System.out.println("Это лето. ");
                break;
            case 7:
                System.out.println("Это лето. ");
                break;
            case 8:
                System.out.println("Это лето. ");
                break;
            case 9:
                System.out.println("Это осень. ");
                break;
            case 10:
                System.out.println("Это осень. ");
                break;
            case 11:
                System.out.println("Это осень. ");
                break;
            case 12:
                System.out.println("Это зима. ");
        }
    }
    public static int dayScanner() {
        Scanner inpu1 = new Scanner(System.in);
        System.out.println("Введите день: ");
        int day = inpu1.nextInt();
        if (day < 1 || day > 31) {
            System.out.print("Неверное число. ");
            dayScanner();
        }
        return day;
    }
    public static int monthScanner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        int month = input.nextInt();
        if (month < 1 || month > 12) {
            System.out.print("Неверное число. ");
            monthScanner();
        }
        return month;
    }
}