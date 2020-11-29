public class Main {

    public static void main(String[]args){

        Game game = new Game();

        System.out.println("Player one name: " + game.player1.name + ". Player one's score: "+ game.player1.Score);
        System.out.println("Player two name: " + game.player2.name + ". Player two's score: "+ game.player2.Score);

        game.deck.shuffle();
        System.out.println(game.drawCompare());

        System.out.println("Player one name: " + game.player1.name + ". Player one's score: "+ game.player1.Score);
        System.out.println("Player two name: " + game.player2.name + ". Player two's score: "+ game.player2.Score);



        // while(game.deck.cardLeft()>0){
        //    PlayingCard tempCard1 =new PlayingCard(game.deck.topMostCard().,)game.deck.topMostCard();
         //   //game.player1
    //}

       // System.out.println(game.deck.topMostCard());



        /*
       DeckOfCards deck = new DeckOfCards();

       System.out.println(deck);

        deck.shuffle();
        System.out.println(deck);

        System.out.println(deck.cardLeft());
        System.out.println(deck.topMostCard());
        System.out.println(deck.cardLeft());

        System.out.println(deck.topMostCard());

        PlayingCard tempCard = new PlayingCard("2" , "spar");
        PlayingCard tempCard2 = new PlayingCard("3" , "spar");
        System.out.println(tempCard.compareTo(tempCard2));

        */
    }
}
