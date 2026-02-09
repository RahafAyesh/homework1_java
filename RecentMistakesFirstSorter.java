import java.util.*;



public class RecentMistakesFirstSorter implements CardOrganizer {

    @Override
    public List<Card> organize(List<Card> cards) {
        List<Card> mistakes = new ArrayList<>();
        List<Card> correct = new ArrayList<>();

        for (Card card : cards) {
            if (card.wasCorrectInLastRound()) {
                correct.add(card);
            } else {
                mistakes.add(card);
            }
        }

        mistakes.addAll(correct);
        return mistakes;
    }
}