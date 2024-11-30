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
                break;
            }
            String answer = playerNum > targetNum ? " больше того, что загадал компьютер" :
                    " меньше того, что загадал компьютер";
            System.out.println(playerNum + answer);
        } while (playerNum != targetNum);
        System.out.println("YOU WIN!");
    }
}
