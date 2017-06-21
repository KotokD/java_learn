package pack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


/**
 * Created by User on 20.06.2017.
 */
public class KosloTest {

  private WebDriver driver;
  private WebDriverWait wait;
    @Before
    public void setUp() throws Exception {
      driver = new ChromeDriver();
      wait = new WebDriverWait (driver,10);
      driver.get("https://koslo.com");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.name("login")).click();
        driver.findElement(By.name("login")).clear();
        driver.findElement(By.name("login")).sendKeys("autouser@mailinator.com");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("123123");
        driver.findElement(By.xpath("//div[@class='buy-contaner']//button[.='Sign In']")).click();
        wait.withTimeout(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("button.close.close-button")).click();


    }

    @Test
    public void testCreateRequest() {
      wait.withTimeout(10, TimeUnit.SECONDS);
      driver.findElement(By.id("dropdownMenuYear")).click();
      driver.findElement(By.linkText("2017")).click();
      wait.withTimeout(10, TimeUnit.SECONDS);
      driver.findElement(By.id("dropdownMenuMake")).click();
      wait.withTimeout(20, TimeUnit.SECONDS);
      driver.findElement(By.linkText("BMW")).click();
      wait.withTimeout(10, TimeUnit.SECONDS);
      driver.findElement(By.id("dropdownMenuModel")).click();
      wait.withTimeout(10, TimeUnit.SECONDS);
      driver.findElement(By.linkText("3 Series")).click();
      wait.withTimeout(10, TimeUnit.SECONDS);
      driver.findElement(By.id("dropdownMenu2")).click();
      wait.withTimeout(10, TimeUnit.SECONDS);
      driver.findElement(By.linkText("Sedan 4D 320xi AWD I4 Turbo")).click();
      wait.withTimeout(10,TimeUnit.SECONDS);
      driver.findElement(By.linkText("FIND YOUR CAR?")).click();
      driver.findElement(By.xpath("//div[@class='takeData-wrapper']//button[.='NEXT ']")).click();
      driver.findElement(By.id("inputZIP")).click();
      driver.findElement(By.id("inputZIP")).clear();
      driver.findElement(By.id("inputZIP")).sendKeys("22222");
      wait.withTimeout(10,TimeUnit.SECONDS);
      driver.findElement(By.xpath("//div[@class='takeData-wrapper']//button[.='Confirm']")).click();
      wait.withTimeout(10,TimeUnit.SECONDS);
      driver.findElement(By.linkText("CONTINUE")).click();



    }

    @After
    public void tearDown() {
      driver.quit();
    }


    }


