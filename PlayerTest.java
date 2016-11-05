import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest{
  Pontoon game;
  Player player1;
  Card card1;

@Before
public void before(){
  game = new Pontoon();
  player1 = new Player();
  card1 = new Card(1, Suit.SPADES);
}

  @Test
  public void playerHasCards(){
    player1.setCard(card1);
    assertEquals(true, player1.getCards() != null);
  }

  

}