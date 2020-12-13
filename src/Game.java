public class Game
{
    Player player1 = new Player("a", 0);
    Player player2 = new Player("b", 0);
    DeckOfCards deck = new DeckOfCards();


    public String drawCompare()
    {

        while (deck.cardLeft() > 0)
        {


            PlayingCard tempPlayerOneCard = deck.cardDraw();
            player1.card.setCardName(tempPlayerOneCard.getCardName());
            player1.card.setSuit(tempPlayerOneCard.getSuit());
            System.out.println("Player one draw: " + tempPlayerOneCard);

            PlayingCard tempPlayerTwoCard = deck.cardDraw();
            player2.card.setCardName(tempPlayerTwoCard.getCardName());
            player2.card.setSuit(tempPlayerTwoCard.getSuit());
            System.out.println("Player two draw: " + tempPlayerTwoCard);

            if (tempPlayerOneCard.compareTo(tempPlayerTwoCard) == 0)
            {
                System.out.println("both player had the same value and");

            } else if (tempPlayerOneCard.compareTo(tempPlayerTwoCard) < 0)
            {
                player1.Score += 1;
                System.out.println("Player one's card was highest and got one point, Player one got" + player1.Score);

            } else
            {
                player2.Score += 1;
                System.out.println("Player two's card was highest and got one point, Player two got" + player2.Score);

            }
        }

        if (player1.Score > player2.Score)
        {
            return "Player 1 won with a score of : " + player1.Score;
        } else if (player2.Score > player1.Score)
        {
            return "Player 2 won with a score of : " + player2.Score;
        } else
        {
            return "both players have the same score and its a draw!";
        }

    }

    public String drawWithDifferenceCount()
    {

        int turn = 1;

        while (deck.cardLeft() > 0)
        {
            System.out.println("\tTurn [ "+ turn++ + " ]");

            PlayingCard tempPlayerOneCard = deck.cardDraw();
            player1.card.setCardName(tempPlayerOneCard.getCardName());
            player1.card.setSuit(tempPlayerOneCard.getSuit());
            System.out.println("Player one draw: " + tempPlayerOneCard);

            PlayingCard tempPlayerTwoCard = deck.cardDraw();
            player2.card.setCardName(tempPlayerTwoCard.getCardName());
            player2.card.setSuit(tempPlayerTwoCard.getSuit());
            System.out.println("Player two draw: " + tempPlayerTwoCard);

            int player1MinusPlayer2CardValue = tempPlayerOneCard.getCardValue() - tempPlayerTwoCard.getCardValue();
            boolean player1HighestValue = player1MinusPlayer2CardValue > 0;
            boolean equalValues = player1MinusPlayer2CardValue == 0;

            int player1minusplayer2SuitValue = tempPlayerOneCard.getSuitValue() - tempPlayerTwoCard.getSuitValue();
            boolean player1HighestSuitValue = player1minusplayer2SuitValue > 0 && !(player1minusplayer2SuitValue == 0);
            boolean equalSuitValues = player1minusplayer2SuitValue == 0;

            if (equalSuitValues) // så bedømmer vi kort værdien
            {
                if(equalValues){
                    System.out.println("Suits and Card values were equal; no-body gets a point");
                } else
                if (player1HighestValue)
                {
                    int score = Math.abs(player1MinusPlayer2CardValue);
                    player1.Score += score;
                    System.out.println("Player one's card value was highest and got " + score + " point, Player one got " + player1.Score);
                } else
                {
                    int score2 = Math.abs(player1MinusPlayer2CardValue);
                    player2.Score += score2;
                    System.out.println("Player two's card value was highest and got " + score2 + " point, Player two got " + player2.Score);
                }
            } else
            {
                    if (player1HighestSuitValue)
                    {
                        int score = Math.abs(player1MinusPlayer2CardValue);
                        player1.Score += score;
                        System.out.println("Player one's suit value was highest and got " + score + " point, Player one got " + player1.Score);
                    } else
                    {
                        int score = Math.abs(player1MinusPlayer2CardValue);
                        player2.Score += score;
                        System.out.println("Player two's suit value was highest and got " + score + " point, Player two got " + player2.Score);

                    }

            }
            System.out.println("\n\t*<------>*");
        }

        if (player1.Score > player2.Score)
        {
            return "Player 1 won with a score of : " + player1.Score;
        } else if (player2.Score > player1.Score)
        {
            return "Player 2 won with a score of : " + player2.Score;
        } else
        {
            return "both players have the same score and its a draw!";
        }


    }

    public String drawCompareWithDifference()
    {

        while (deck.cardLeft() > 0)
        {


            PlayingCard tempPlayerOneCard = deck.cardDraw();
            player1.card.setCardName(tempPlayerOneCard.getCardName());
            player1.card.setSuit(tempPlayerOneCard.getSuit());
            System.out.println("Player one draw: " + tempPlayerOneCard);

            PlayingCard tempPlayerTwoCard = deck.cardDraw();
            player2.card.setCardName(tempPlayerTwoCard.getCardName());
            player2.card.setSuit(tempPlayerTwoCard.getSuit());
            System.out.println("Player two draw: " + tempPlayerTwoCard);

            if (tempPlayerOneCard.compareTo(tempPlayerTwoCard) < 0)
            {
                player1.Score += 1;
//                player1.Score+= player1.card.compareTo(player2.card);
                System.out.println("Player one's card was highest and got " + -1 * (player1.card.compareTo(player2.card)) + " point, Player one got " + player1.Score);

            } else
            {
                player2.Score += 1;
//                player2.Score+=player2.card.compareTo(player1.card);
                System.out.println("Player two's card was highest and got " + -1 * (player2.card.compareTo(player1.card)) + " point, Player two got " + player2.Score);

            }
        }

        if (player1.Score > player2.Score)
        {
            return "Player 1 won with a score of : " + player1.Score;
        } else if (player2.Score > player1.Score)
        {
            return "Player 2 won with a score of : " + player2.Score;
        } else
        {
            return "both players have the same score and its a draw!";
        }

    }

}
