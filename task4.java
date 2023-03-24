import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);    

        Scanner a = new Scanner(System.in);
        System.out.println("Введите a1:");
        int n1 = a.nextInt();
        
        Scanner b = new Scanner(System.in);
        System.out.println("Введите b2:");
        int n2 = b.nextInt();

        System.out.print("Какое будет действие:");
        char operation = iScanner.next().charAt(0);

        int total = 0;
        switch (operation){
            case '+':
                total = n1 + n2;
                break;
            case '-':
                total = n1 - n2;
                break;
            case '*':
                total = n1 * n2;
                break;
            case '/':
                total = n1 / n2;
                break;
            }
    System.out.println("Итог: " + total);
    a.close();
    b.close();
    }
}
 