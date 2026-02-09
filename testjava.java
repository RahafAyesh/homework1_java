
    import java.util.*;


public class testjava {

    public static void main(String[] args) {

        List<Card> cards = Arrays.asList(
        new Card("1", true), 
        new Card("2", true),  
        new Card("3", false), 
        new Card("4", true)   
        );

        System.out.println("cards Before sorting:");
        cards.forEach(System.out::println);

        CardOrganizer sorter = new RecentMistakesFirstSorter();
        List<Card> sorted = sorter.organize(cards);

        System.out.println("\n the cards After sorting:");
        sorted.forEach(System.out::println);
    }
}

