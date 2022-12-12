import java.util.Scanner;
public class BabkaLabka14 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите x: "); int x = input.nextInt();
        System.out.println("Введите n (-15 < n < 15): "); int n = input.nextInt();
            if(n < -14 || n > 14){
                System.out.println("Некорректный ввод, возвращение в начало я не прописал, перезапустите программу и введите как просят.  ");
            }
        int sum = x;
        for(int i=0; i<Math.abs(n)-1; i++){
            sum*=x;
        }
        if(n==0){
            System.out.println(x+" в степени "+n+" будет равно 1");
        }
        else if (n<0) {
            System.out.println(x+" в степени "+n+" будет равно "+(1.0f/sum));
        }
        else {
            System.out.println(x+" в степени "+n+" будет равно "+sum);
        }

    }
}
