package lesson1.final_;

import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        int targetNum = (int) (Math.random() * 100) + 1;
        int playerNum;
        Scanner sc = new Scanner(System.in);

        do {
            playerNum = sc.nextInt();
            System.out.println(targetNum);
            if (playerNum != targetNum) {
                String answer = playerNum > targetNum ? " больше " :
                        " меньше ";
                System.out.println(playerNum + answer + "того, что загадал компьютер");
            }
        } while (playerNum != targetNum);
        System.out.println("YOU WIN!");
    }
}
