import static org.junit.Assert.*;
import org.junit.*;

public class PontoonTest{
  Pontoon game;
  Player player1;
  Player player2;

@Before
public void before(){
  game = new Pontoon();
  player1 = new Player();
  player2 = new Player();
  game.setPlayer(player1);
  game.setPlayer(player2);
  game.buildDeck();
  game.deal();
  
}

  @Test
  public void gameExists(){
    assertEquals(true, game != null);
  }

  @Test
  public void gameHasPlayers(){
    
    assertEquals(true, game.playersCount() == 2);
  }

  @Test
  public void gameHasDeck(){
    assertEquals(true, game.getDeck() != null);
  }

  // @Test
  // public void gameHasAllCards(){
  //   assertEquals(true, game.getDeck().size() ==(4*12));
  // }

  @Test
  public void gameCanDeal(){
    
    
    assertEquals(true, player1.getCards().size() >0 );
    assertEquals(true, player2.getCards().size() >0 ); 
  }

   // @Test 
   // public void gameCanHaveWinner(){
   //  game.setWinner(player1);
   //  assertEquals(true, game.getWinner() != null);
   // }

   @Test
   public void gameCanCheckWinner(){
    System.out.println(player1.getHand());
    System.out.println(player2.getHand());
    assertEquals(game.checkWinner(),game.getWinner());
   }


}