public class Game
{
    Player player1= new Player("a",0);
    Player player2= new Player("b", 0);
    DeckOfCards deck = new DeckOfCards();






public String drawCompare()
{

    while(deck.cardLeft()>0){


        PlayingCard tempPlayerOneCard = deck.cardDraw();
        player1.card.setCardName(tempPlayerOneCard.getCardName());
        player1.card.setSuit(tempPlayerOneCard.getSuit());
        System.out.println("Player one draw: "+tempPlayerOneCard);

        PlayingCard tempPlayerTwoCard = deck.cardDraw();
        player2.card.setCardName(tempPlayerTwoCard.getCardName());
        player2.card.setSuit(tempPlayerTwoCard.getSuit());
        System.out.println("Player two draw: "+tempPlayerTwoCard);

        if(tempPlayerOneCard.compareTo(tempPlayerTwoCard)<0){
            player1.Score+=1;
            System.out.println("Player one's card was highest and got one point, Player one got"+player1.Score);

        }
        else{
            player2.Score+=1;
            System.out.println("Player two's card was highest and got one point, Player two got"+player2.Score);

        }
    }

    if(player1.Score>player2.Score){
        return "Player 1 won with a score of : " + player1.Score;
    }
    else if( player2.Score>player1.Score)
    {
        return "Player 2 won with a score of : " + player2.Score;
    }
    else{
    return "both players have the same score and its a draw!";
    }

}

}
