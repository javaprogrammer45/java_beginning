package Lesson1;

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
            }
            String answer = playerNum > targetNum ? playerNum + " больше того, что загадал компьютер" : targetNum + " меньше того, что загадал компьютер";
            System.out.println(answer);
        } while (playerNum != targetNum);
    }
}
