import static org.junit.Assert.*;
import org.junit.*;

public class PontoonTest{
  Pontoon game;
  Player player1;

@Before
public void before(){
  game = new Pontoon();
  player1 = new Player();
  game.buildDeck();
}

  @Test
  public void gameExists(){
    assertEquals(true, game != null);
  }

  @Test
  public void gameHasPlayers(){
    game.setPlayer(player1);
    assertEquals(true, game.playersCount() == 1);
  }

  @Test
  public void gameHasDeck(){
    assertEquals(true, game.getDeck() != null);
  }

  @Test
  public void gameHasAllCards(){
    assertEquals(true, game.getDeck().size() ==(4*12));
  }


  // @Test
  // public void gameCanDeal(){
  //   game.deal();
  //   assertEquals(true, player1.getCards() > 1);
  // }


}