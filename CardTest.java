import static org.junit.Assert.*;
import org.junit.*;

public class CardTest{
  
  
  Card card1;

@Before
public void before(){

  card1 = new Card(1, Suit.SPADES);
}

  @Test
  public void cardHasvalue(){
    assertEquals(true, card1.getValue() == 1);
  }

  @Test
  public void cardHasSuit(){
    assertEquals(Suit.SPADES, card1.getSuit());
  }

  

}