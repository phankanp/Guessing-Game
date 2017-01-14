import java.util.Scanner;

public class Prompter {

    private String itemType;
    private int maxNumber;
    private int answer;
    private int guessAmount;
    private int fill;

    Scanner scanner = new Scanner(System.in);

    public Prompter() {
        itemType = "";
        maxNumber = 0;
        answer = 0;
        guessAmount = 1;
        fill = 0;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getGuessAmount() {
        return guessAmount;
    }

    public void setGuessAmount(int guessAmount) {
        this.guessAmount = guessAmount;
    }

    public int getFill() {
        return fill;
    }

    public void setFill(int fill) {
        this.fill = fill;
    }

    public void adminPrompt() {
        System.out.println("Administrator: Jar Set-Up!");

        System.out.print("What type of item should fill the jar? ");
        itemType = scanner.next();

        System.out.print("What is the maximum number of " + itemType + " the jar can hold? ");
        maxNumber = scanner.nextInt();

        Jar jar = new Jar(itemType, maxNumber);

        jar.fill();

        fill = jar.fill();

        System.out.println();
    }

    public void userPrompt() {
        System.out.println("User: Play the Game!");

        System.out.print("How many " + itemType + " are in the jar? Pick a number between 1 and " + maxNumber + ": ");
        answer = scanner.nextInt();

        System.out.println();
    }

    public void checkAnswer() {
        if (answer > maxNumber) {
            overGuess();
        } else if (answer > fill && answer <= maxNumber) {
            tooHigh();
        } else if (answer < fill) {
            tooLow();
        }
    }

    public void overGuess() {

        System.out.print("Your guess must be less than " + maxNumber + " Try Again: ");
        answer = scanner.nextInt();

        checkAnswer();
    }

    public void tooHigh() {

        System.out.print("Wrong! Your answer was too High. Try Again: ");
        answer = scanner.nextInt();

        guessAmount++;

        checkAnswer();
    }

    public void tooLow() {

        System.out.print("Wrong! Your answer was too Low. Try Again: ");
        answer = scanner.nextInt();

        guessAmount++;

        checkAnswer();
    }

    public void correctAnswer() {
        System.out.println();

        System.out.println("Correct! You got it in " + guessAmount + " attempt(s)");
    }
}
