import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PlayingCard implements Comparable<PlayingCard>,Iterable<PlayingCard> {

    private String cardName;
    private String suit;

    public PlayingCard(String cardName, String suit){
        setCardName(cardName);
        setSuit(suit);

    }

    /**
     * Denne metode retunere en liste af kort navne der er acceptable kort navne
     * til at oprette objecter med
     * @return "ace","2","3","4","5","6","7","8","9","10","bonde","dame","konge"
     */
    public static List<String> getValidCardNames(){
        return Arrays.asList("ace","2","3","4","5","6","7","8","9","10","bonde","dame","konge");
    }

    /**
     * Denne metode retunere en liste over Kulør(suit) der er acceptable til kort
     * når der skal oprettet et kort object
     * @return "spar","hjerter","klør","ruder"
     */
    public static List<String> getValidSuit(){
        return Arrays.asList("spar","hjerter","klør","ruder");
    }


    public String getCardName() {
        return cardName;
    }

    public String getSuit() {
        return suit;
    }

    public void setCardName(String cardName) {
        List<String> validCardNames = getValidCardNames();
        cardName = cardName.toLowerCase();


        // checker om kortet der ønskes oprettet findes på listen over valide kortnavne
        if(validCardNames.contains(cardName)){
            this.cardName = cardName;
        }
        else{
            // hvis kortet der ønskes oprettet ikke findes på listen over valid kort sendes en exception
            throw new IllegalArgumentException("Card type not valid, valid cards are" + validCardNames);
        }

    }

    public void setSuit(String suit) {
        List<String> validSuitNames = getValidSuit();
        suit = suit.toLowerCase();

        if(validSuitNames.contains(suit)){
            this.suit = suit;
        }
        else{
            throw new IllegalArgumentException("suit type not valid, valid suit's are" + validSuitNames);
        }


    }


    @Override
    public String toString(){
        return  suit+ " "+ cardName+ "\n";

    }

    @Override
    public int compareTo(PlayingCard o) {
//        if(this.cardName==o.cardName){
//            return 0;
//        }
//        if(this.cardName<o.cardName){
//            return -1;
//        }
//        else{
//            return 1;
//        }
        return 0;

    }


    @Override
    public Iterator<PlayingCard> iterator() {
//        while(getValidCardNames().)
        return this.iterator();
    }
}
