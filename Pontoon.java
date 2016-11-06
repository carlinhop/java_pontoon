import java.util.ArrayList;


public class Pontoon{

  private ArrayList<Player> players;
  private ArrayList<Card> deck;
  private Player winner;

  public Pontoon(){
    this.players = new ArrayList<Player>();
    this.deck = new ArrayList<Card>();

  }

  public void buildDeck(){
    for(Suit suit : Suit.values()){
      for(int i = 1; i < 13; i++){
        Card card = new Card(i, Suit.SPADES);
        this.deck.add(card);
      }
    }
  }

  public void setPlayer(Player player){
    this.players.add(player);
  }

  public ArrayList<Player> getPlayers(){
    return this.players;
  }

  public int playersCount(){
    return this.players.size();
  }


  public ArrayList<Card> getDeck(){
    return deck;
  }

  public void deal(){
    for(Player player : this.players){
      for(int i = 0; i < 2; i++){

        player.setCard(this.deck.get(0));
        this.deck.remove(0);
        
      }
    }
  }

  public Player getWinner(){
    return this.winner;
  }

  public void setWinner(Player winner){
    this.winner = winner;
  }

  public Player checkWinner(){
    int winnerHand = 0;
    int playerHand = 0;
    for (Player player : this.players){
      
      playerHand = player.getHand();
      

      if(winnerHand < playerHand){
        this.winner = player;
      }
    }
    //System.out.println(winner);
    //System.out.println(this.winner.getHand());
    return this.winner;
  }



}
