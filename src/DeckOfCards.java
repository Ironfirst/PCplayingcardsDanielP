import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private ArrayList<PlayingCard> deck;


    public DeckOfCards(){
        List<String> suits = PlayingCard.getValidSuit(); // calling a static method so i dont need an instance of card to call it
        List<String> cardNames = PlayingCard.getValidCardNames();

        deck = new ArrayList<>();

        for(String suit:suits)
        {
            for(String cardName:cardNames){
                deck.add(new PlayingCard(cardName,suit));
            }

        }
    }

    public ArrayList<PlayingCard> shuffle(){
        Collections.shuffle(deck);
        return deck;
    }

    public String topMostCard(){
       String topCard = deck.get(0).getSuit() + " " + deck.get(0).getCardName();
       deck.remove(0);
       return topCard;
    }

    public int cardLeft(){
        return deck.size();
    }

    @Override
    public String toString() {
        return "DeckOfCards \n" +
                  deck;
    }

}
