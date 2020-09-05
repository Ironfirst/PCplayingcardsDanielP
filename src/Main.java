public class Main {

    public static void main(String[]args){

       DeckOfCards deck = new DeckOfCards();

        System.out.println(deck);

        deck.shuffle();
        System.out.println(deck);

        System.out.println(deck.cardLeft());
        System.out.println(deck.topMostCard());
        System.out.println(deck.cardLeft());

        System.out.println(deck.topMostCard());

    }
}
