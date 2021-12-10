import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginMethod  {
    private static WebDriver driver = Util.getDriver();



    //logging into account
    public static void login(){
    WebElement username = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input"));
    username.sendKeys("chocolate");
    WebElement password = driver.findElement(By.xpath("//input[@class='input' and @name='password']"));
    password.sendKeys("123");
    WebElement submit_button = driver.findElement(By.cssSelector("input.button"));
    submit_button.click();

    }

}
