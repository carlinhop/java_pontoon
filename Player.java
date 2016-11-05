import java.util.ArrayList;
public class Player{

  private ArrayList<Card> cards;

  public Player(){
  this.cards = new ArrayList<Card>();  
  }

  public ArrayList<Card> getCards(){
    return this.cards;
  }

  public void setCard(Card card){
    this.cards.add(card);
  }
}