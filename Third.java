import java.util.Scanner;
public class Third {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество точек: "); int n = input.nextInt();
        System.out.println("Введите радиус круга: "); int r = input.nextInt();

        int[][] arrDots = new int[n][2];
        for(int i=0; i<n; i++) {
            for (int j = 0; j < 2; j++) {
                switch(j) {
                    case 0: System.out.println("Введите X точки " + (i + 1)+":"); arrDots[i][j]=input.nextInt();
                       break;
                    case 1: System.out.println("Введите Y точки " + (i + 1)+":");  arrDots[i][j]=input.nextInt();
                       break;
                }
            }
        }
        byte amountDots=0;
        for(int i=0; i<n; i++) {
            if((arrDots[i][0]*arrDots[i][0]+arrDots[i][1]*arrDots[i][1])<r*r){
                ++amountDots;
            }
        }
        System.out.println(amountDots+" точки(а) попали(а) в окружность.");
    }
}
