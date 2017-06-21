package pack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by User on 19.06.2017.
 */
public class FirstClass {
  private WebDriver driver;
  private WebDriverWait wait;

  @Before
  public void start(){
    driver = new ChromeDriver();
    wait = new WebDriverWait (driver,10);

  }
  @Test
  public void FirstTest() {
    driver.get("https://www.google.com");
    WebElement q =driver.findElement(By.name("q"));
    q.sendKeys("webdriver");
    driver.findElement(By.name("btnG")).click();


  }
  @After
  public void stop(){
    driver.quit();
    driver=null;

  }

}
