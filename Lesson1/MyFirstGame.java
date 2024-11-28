import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        int targetNum = (int) (Math.random() * 100) + 1;
        int playerNum;
        Scanner sc = new Scanner(System.in);
        do {
            playerNum = sc.nextInt();
            System.out.println(targetNum);
            if (playerNum == targetNum) {
                System.out.println("YOU WIN!");
                break;
            } else if (playerNum > targetNum) {
                System.out.println(playerNum + " больше того, что загадал компьютер");
            } else {
                System.out.println(playerNum + " меньше того, что загадал компьютер");
            }
        } while (playerNum != targetNum);
    }
}
