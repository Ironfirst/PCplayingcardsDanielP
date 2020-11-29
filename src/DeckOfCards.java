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

    // opret et object istedet for en midlertidig string og retuner dette object efter slettelse af det oprindelige top object
   /* public String topMostCard(){
       String topCard = deck.get(0).getSuit() + " " + deck.get(0).getCardName();
       deck.remove(0);
       return topCard;
    }

    */
// denne metode retunere et kort objekt istedet for en string med kortets værdi.
    // kan derfor bruges til at give en player et kort træk med objekt af kortet istedet for string.
    // det er nemmere af sammenligne på denne måde.!?
    public PlayingCard cardDraw(){
        PlayingCard tempCardFromDraw = new PlayingCard(deck.get(0).getCardName(),deck.get(0).getSuit());
        deck.remove(0);
        return tempCardFromDraw;
    }

    public int cardLeft(){
        return deck.size();
    }

    //public int cardEvaluator{
     //
    //}

    @Override
    public String toString() {
        return "DeckOfCards \n" +
                  deck;
    }

}
