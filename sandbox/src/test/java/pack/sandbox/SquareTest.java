package pack.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by User on 10.06.2017.
 */

public class SquareTest {

  @Test
  public void Test (){
    Square s = new Square(5);
    Assert.assertEquals(s.area(),25.0);
  }
}

