import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PlayingCard implements Comparable<PlayingCard> {

    private String cardName;
    private String suit;

    public PlayingCard(String cardName, String suit){
        setCardName(cardName);
        setSuit(suit);
    }

    public PlayingCard(){}

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
    // leg med enum som farver og typer kort " suit og card"
    //" slå ordinal metoden op og se om den virker til compare."
/*
    public boolean compareTo(object o){
        if (this == o)
    }
    */
    @Override
    public int compareTo(PlayingCard o) {

        int CardNameValue = 0;
        int NextCardNameValue = 0;
        int SuitNameValue = 0;
        int NextSuitNameValue = 0;

        // iterere igennem valid card names med current object og finder cardname værdi
        for(int i=0;i<getValidCardNames().size();i++){
            if(this.cardName==getValidCardNames().get(i)){
               CardNameValue = i;
            }
        }

        // iterere igennem valid card names med næstee object og finder cardname værdi
        for(int i=0;i<getValidCardNames().size();i++){
            if(o.cardName==getValidCardNames().get(i)){
                NextCardNameValue = i;
            }
        }

        // iterere igennem valid suit names og finder suitname værdi
        for(int a=0;a<getValidSuit().size();a++)
        {
            if (this.suit == getValidSuit().get(a))
            {
                SuitNameValue = a;
            }
        }
        // iterere igennem valid suit names og finder Nextsuitname værdi
            for(int k=0;k<=getValidSuit().size()-1;k++){
                if(this.suit==getValidSuit().get(k)){
                    NextSuitNameValue = k;
                }

        }
        if(CardNameValue == NextCardNameValue)
        {
            if(SuitNameValue==NextSuitNameValue){
                return 0;
            }
            else if(SuitNameValue > NextSuitNameValue){
                return 1;
            }
            else{
                return -1;
            }
        }
        else if(CardNameValue > NextCardNameValue){
            return 1;
        }
        else{
            return -1;
        }




        /*
        if(this.cardName.indexOf(this.cardName)==o.cardName.indexOf(o.cardName)){
            return 0;
        }
        else if(this.cardName.indexOf(this.cardName)>o.cardName.indexOf(o.cardName)){
            return 1;
        }
        else{
            return -1;
        }
      */


    }
}


//    @Override
//    public boolean equals(Object o) {
//        return (o != null && o instanceof Card && ((Card) o).mRank == mRank && ((Card) o).mSuit == mSuit);
//    }