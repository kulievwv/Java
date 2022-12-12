import java.util.Scanner;
public class Noname {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String [] elements = input.split( " ");
        int a=0, b=0, flag=0, flagRoman=0, result = 0;
        String [] romanianUnits = {"0", "I", "II", "III", "IV", "V","VI", "VII", "VIII", "IX" };
        String [] romanianDozens = {"0", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        if (elements.length==3){
                switch (elements[0]){
                    case "1": a=1; flag++; break;
                    case "2": a=2; flag++; break;
                    case "3": a=3; flag++;  break;
                    case "4": a=4; flag++;  break;
                    case "5": a=5; flag++;  break;
                    case "6": a=6; flag++;  break;
                    case "7": a=7; flag++; break;
                    case "8": a=8; flag++;  break;
                    case "9": a=9; flag++;  break;
                    case"10":a=10; flag++;  break;
                    case "I" : a=1; flagRoman++; break;
                    case "II": a=2;  flagRoman++; break;
                    case "III": a=3;  flagRoman++; break;
                    case "IV": a=4; flagRoman++;  break;
                    case "V": a=5;  flagRoman++; break;
                    case "VI": a=6; flagRoman++;  break;
                    case "VII": a=7;  flagRoman++; break;
                    case "VIII": a=8; flagRoman++;  break;
                    case "IX": a=9; flagRoman++;  break;
                    case "X": a=10;  flagRoman++; break;
                    default: System.out.println("Числа для ввода должны быть от 1 до 10 включительно.");
                }
            switch (elements[2]){
                case "1": b=1;  flag++; break;
                case "2": b=2; flag++;  break;
                case "3": b=3; flag++;  break;
                case "4": b=4; flag++;  break;
                case "5": b=5; flag++;  break;
                case "6": b=6; flag++;  break;
                case "7": b=7; flag++;  break;
                case "8": b=8; flag++;  break;
                case "9": b=9; flag++;  break;
                case "10": b=10; flagRoman++;  break;
                case "I" : b=1;  flagRoman++; break;
                case "II": b=2; flagRoman++;  break;
                case "III": b=3;  flagRoman++; break;
                case "IV": b=4; flagRoman++;  break;
                case "V": b=5;  flagRoman++; break;
                case "VI": b=6; flagRoman++;  break;
                case "VII": b=7; flagRoman++;  break;
                case "VIII": b=8; flagRoman++;  break;
                case "IX": b=9;  flagRoman++; break;
                case "X": b=10; flagRoman++;  break;
                default: System.out.println("Числа для ввода должны быть от 1 до 10 включительно.");
            }
        switch (elements[1]){
            case "+": result=(a+b); break;
            case "-": result=(a-b); break;
            case "*": result=(a*b); break;
            case "/": result=(a/b); break;
        }
        if(flag==2){
            System.out.println(result);
        }
        else if(flag==1 && flagRoman==1){
            System.out.println("Используются одновременно разные системы счисления.");
        }
        else if(flagRoman==2){
            if(result>0){
                if(result>9){
                    if(result%10>0){
                        System.out.println(romanianDozens[result/10]+romanianUnits[result%10]);
                    }
                    else {
                        System.out.println(romanianDozens[result/10]);
                    }
                }
                else{
                    System.out.println(romanianUnits[result]);
                }
            } else{
                System.out.println("В римской системе нет отрицательных чисел");
            }
        }
        } else if(elements.length<3){
             System.out.println("Строка не является математической операцией. ");
        } else if (elements.length>3) {
            System.out.println("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *). ");
        }
    }
}
