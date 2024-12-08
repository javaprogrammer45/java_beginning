package lesson_2_3.guess;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber() {
    }

    public int guessNumberPlayer(Player player, int number) {
        return player.getNumber() != number ? 1 : 0;
    }
}