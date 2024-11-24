import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100) + 1;
        int gamer;
        do {
            Scanner sc = new Scanner(System.in);
            gamer = sc.nextInt();
            System.out.println(random);
            if (gamer == random) {
                System.out.println("YOU WIN!");
                break;
            } else if (gamer > random) {
                System.out.println(gamer + " больше того, что загадал компьютер");
            } else {
                System.out.println(gamer + " меньше того, что загадал компьютер");
            }
        } while (gamer != random);
    }
}
