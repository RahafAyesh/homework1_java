

public class Card {
    private  String question;
    private  boolean correctLastRound;

    public Card(String question, boolean correctLastRound) {
        this.question = question;
        this.correctLastRound = correctLastRound;
    }

    public boolean wasCorrectInLastRound() {
        return correctLastRound;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        String result;
 if (correctLastRound) {
    result = "has a correct answer  ";
} else {
    result = "has a wrong answer ";
}

return "Question: " + question +" " + result ;
    }
}