public class Game {

    public static void main(String[] args) {
        Prompter prompter = new Prompter();
        
        prompter.adminPrompt();
        prompter.userPrompt();

        while (prompter.getAnswer() != prompter.getFill()) {
            prompter.checkAnswer();
        }

        prompter.correctAnswer();
    }
}