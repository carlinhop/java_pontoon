import java.util.ArrayList;

public class Pontoon{

  private ArrayList<Player> players;
  private ArrayList<Card> deck;

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

  // public void deal(){
  //   for(Player player : this.players){
  //     Card card1 = new Card(1, SPADES);
  //     Card card2 = new Card(2,SPADES);
  //     player.setCard(card1);
  //     player.setCard(card2);

  //   }
  // }

}

// Card card1 = new Card((Math.round(Math.random()*12))+1);