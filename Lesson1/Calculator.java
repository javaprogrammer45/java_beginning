import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();
        char sign = '^';
        int result = 0;
        if (b == sign) {
            result = 1;
            for (int i = 1; i <= c; i++) {
                result *= a;
            }
        } else if (b == '%') {
            result = a % c;
            sign = '%';
        } else if (b == '+') {
            result = a + c;
            sign = '+';
        } else if (b == '-') {
            result = a - c;
            sign = '-';
        } else if (b == '*') {
            result = a * c;
            sign = '*';
        } else if (b == '/') {
            result = a / c;
            sign = '/';
        }
        System.out.println(a + " " + sign + " " + c + " = " + result);
    }
}
