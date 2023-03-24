import java.util.Scanner;
public class task1_2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("ведите число : ");
        int x = num.nextInt();
        SumArithmeticProgression(x);
        Factorial(x);
    }
  
     static void SumArithmeticProgression (int x) {
        int sum = 0;
        int a = 1;
        for (int i = 0; i < x; i++) {
            sum=sum+a;
            a++;
        }
        System.out.printf("Сумма 1 до %d: %d%n", x, sum);
     }  
       
     static void Factorial(int x) {
        int sum = 1;
        int a = 1;
        for (int i = 0; i < x; i++) {
            sum=sum*a;
            a++;
        }
        System.out.printf("Факториал числа %d! = %d%n", x, sum);
     }
}
