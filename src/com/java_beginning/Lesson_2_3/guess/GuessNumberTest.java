package Lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Player player1 = new Player("Bob");
        Player player2 = new Player("Alex");
        GuessNumber guess = new GuessNumber();
        int targetNum;
        do {
            targetNum = (int) (Math.random() * 100) + 1;
            guess.enterDataPlayer(player1);
            guess.guessNumberPlayer(player1, targetNum);
            String answer = guess.guessNumberPlayer(player1, targetNum) != 0 ? "Не угадал, " +
                    player1.getNumber() + " не равно " + targetNum +
                    ", переход хода к другому игроку..." : player1.getName() + " is Winner ";
            if (answer.equals(player1.getName() + " is Winner ")) {
                System.out.println(answer);
                System.out.println("Do you want to play again? [yes/no]: ");
                Scanner sc = new Scanner(System.in);
                String agreement = sc.nextLine();
                if (agreement.equals("yes")) {
                    continue;
                } else if (agreement.equals("no")) {
                    return;
                } else {
                    while (!agreement.equals("yes") && !agreement.equals("no")) {
                        System.out.println("Do you want to play again? [yes/no]: ");
                        agreement = sc.nextLine();
                    }
                }
                if (agreement.equals("yes")) {
                    continue;
                }
                if (agreement.equals("no")) {
                    return;
                }
            }
            System.out.println(answer);

            guess.enterDataPlayer(player2);
            guess.guessNumberPlayer(player2, targetNum);
            answer = guess.guessNumberPlayer(player2, targetNum) != 0 ? "Не угадал, " + player2.getNumber() +
                    " не равно " + targetNum +
                    ", переход хода к другому игроку..." : player2.getName() + " is Winner ";

            if (answer.equals(player2.getName() + " is Winner ")) {
                System.out.println(answer);
                System.out.println("Do you want to play again? [yes/no]: ");
                Scanner sc = new Scanner(System.in);
                String agreement = sc.nextLine();
                if (agreement.equals("yes")) {
                    continue;
                } else if (agreement.equals("no")) {
                    return;
                } else {
                    while (!agreement.equals("yes") && !agreement.equals("no")) {
                        System.out.println("Do you want to play again? [yes/no]: ");
                        agreement = sc.nextLine();
                    }
                }
                if (agreement.equals("yes")) {
                    continue;
                }
                if (agreement.equals("no")) {
                    return;
                }
            }
            System.out.println(answer);
        } while (guess.guessNumberPlayer(player1, targetNum) != 0 ||
                guess.guessNumberPlayer(player1, targetNum) != 0);
    }
}
