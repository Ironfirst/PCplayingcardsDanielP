public class Player extends PlayingCard
{

    String name;
    int Score;
    PlayingCard card = new PlayingCard();

    public Player(String name, int score, PlayingCard card)
    {
        this.name = name;
        Score = score;
        this.card = card;
    }

    public Player(String name, int score){

        this.name=name;
        this.Score=score;
    }

    public Player(){

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getScore()
    {
        return Score;
    }

    public void setScore(int score)
    {
        Score = score;
    }


    @Override
    public String toString()
    {
        return "Player{" +
                "name='" + name + '\'' +
                ", Score=" + Score +
                '}';
    }
}
