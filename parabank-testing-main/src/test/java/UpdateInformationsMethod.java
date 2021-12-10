import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UpdateInformationsMethod {
    private static WebDriver driver = Util.getDriver();


//update users new contact information
public static void UpdateProfile(){
    WebElement updateinfo = driver.findElement(By.xpath("//a[@href='/parabank/updateprofile.htm']"));
    updateinfo.click();
    WebElement firstname = driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]"));
    firstname.clear();
    firstname.sendKeys("Thomas");
    WebElement lastname = driver.findElement(By.xpath("//*[@id=\"customer.lastName\"]"));
    lastname.clear();
    lastname.sendKeys("Braddison");
    WebElement address = driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]"));
    address.clear();
    address.sendKeys("123 ft ln");
    WebElement City = driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]"));
    City.clear();
    City.sendKeys("hut");
    WebElement State = driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]"));
    State.clear();
    State.sendKeys("NC");
    WebElement Zipcode= driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]"));
    Zipcode.clear();
    Zipcode.sendKeys("28375");
    WebElement PhoneNumber = driver.findElement(By.xpath("//*[@id='customer.phoneNumber']"));
    PhoneNumber.clear();
    PhoneNumber.sendKeys("3208675309");
    WebElement update_profile = driver.findElement(By.xpath("//*[@type='submit']"));
    update_profile.click();
    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/h1")).getText();
    Assert.assertTrue("Profile Updated",true);

}


}
